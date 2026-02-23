import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0.0;
    private static double annualInterestRate = 0.0;
    private Date dateCreated;

    public Account() {
        dateCreated = new Date();
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }

    // Accessors + mutators
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }

    public static double getAnnualInterestRate() { return annualInterestRate; }
    public static void setAnnualInterestRate(double rate) { annualInterestRate = rate; }

    public Date getDateCreated() { return dateCreated; }

    // Monthly interest calculations
    public double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    // Transaction methods
    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public static void main(String[] args) {
        //Create accouunt with withdraw + deposit
        Account acc = new Account(1122, 20000);
        Account.setAnnualInterestRate(4.5); 

        acc.withdraw(2500);
        acc.deposit(3000);

        System.out.printf("Account Balance: $%.2f%n", acc.getBalance());
        System.out.printf("Monthly Interest: $%.2f%n", acc.getMonthlyInterest());
        System.out.println("Account Created: " + acc.getDateCreated());
    }
}
