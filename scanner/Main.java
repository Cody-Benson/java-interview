import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter your name");
        String name = scanner.nextLine();
        System.out.printf("welcome %s\n",name);

        System.out.println("please enter your age");
        int age = scanner.nextInt();

        System.out.println("please enter a double");
        double d = scanner.nextDouble();


    }
}