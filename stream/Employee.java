public class Employee {
    private int id;
    private int balance;
    public Employee(int id){
        this.id = id;
        this.balance = 0;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }

    public void credit(int amount){
        this.balance += amount;
    }

    public void debit(int debit){
        this.balance -= debit;
    }

    public int getBalance(){
        return this.balance;
    }
}
