public class Main {
    public static void main(String[] args){
        StringBuilder phoneNumber = new StringBuilder();
        phoneNumber.append("1234567890");
        phoneNumber.insert(0, "(");
        phoneNumber.insert(4, ")");
        phoneNumber.insert(5," ");
        phoneNumber.insert(9, "-");

        System.out.println(phoneNumber);
    }
}
