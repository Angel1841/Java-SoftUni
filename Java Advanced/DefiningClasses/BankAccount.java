public class BankAccount {

    private int id;
    private double balance;

    private static double interestRate = 0.02;
    private static int nextId = 1;

    public BankAccount() {
        this.id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void setInterestRate(double interest){
        interestRate = interest;
    }

    public double getInterestRate(int years) {
        return years * interestRate * this.balance;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

}
