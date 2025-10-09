class Main{
    public static void main(String[] args) {
        // Create a shared StringBuffer instance
        StringBuffer sharedBuffer = new StringBuffer("Initial Text");

        // Create multiple threads that append to the StringBuffer
        Runnable task = () -> {
            for (int i = 0; i < 100; i++) {
                // StringBuffer is thread-safe, so no external synchronization is needed
                sharedBuffer.append(Thread.currentThread().getName()).append(":").append(i).append(",");
                try {
                    // Simulate some delay to increase thread contention
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        // Create and start multiple threads
        Thread thread1 = new Thread(task, "Thread-1");
        Thread thread2 = new Thread(task, "Thread-2");
        Thread thread3 = new Thread(task, "Thread-3");

        thread1.start();
        thread2.start();
        thread3.start();

        // Wait for all threads to complete
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Print the final content of the StringBuffer
        System.out.println("Final StringBuffer content: " + sharedBuffer);
        System.out.println("Length of StringBuffer: " + sharedBuffer.length());
    }
}