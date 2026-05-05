abstract class Accounts {
    protected double balance;
    protected String accountNumber;
    protected String accountHoldersName;
    protected String address;

    public Accounts(String accountNumber, String accountHoldersName, String address, double balance) {
        this.accountNumber = accountNumber;
        this.accountHoldersName = accountHoldersName;
        this.address = address;
        this.balance = balance;
    }

    abstract void withdrawl(double amount);
    
    abstract void deposit(double amount);

    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
}

class SavingsAccount extends Accounts {
    private double rateOfInterest;

    public SavingsAccount(String accountNumber, String accountHoldersName, String address, double balance, double rateOfInterest) {
        super(accountNumber, accountHoldersName, address, balance);
        this.rateOfInterest = rateOfInterest;
    }

    @Override
    void withdrawl(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    @Override
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void calculateAmount() {
        double interest = balance * (rateOfInterest / 100);
        balance += interest;
        System.out.println("Interest calculated and added: " + interest);
        System.out.println("Total Amount after interest: " + balance);
    }
}

public class BankApplication {
    public static void main(String[] args) {
        SavingsAccount myAccount = new SavingsAccount("ACC098765", "Alice Smith", "123 Maple Street", 10000.0, 4.5);
        
        myAccount.display();
        System.out.println();
        
        myAccount.deposit(2500.0);
        myAccount.display();
        System.out.println();
        
        myAccount.withdrawl(3000.0);
        myAccount.display();
        System.out.println();
        
        myAccount.calculateAmount();
        System.out.println();
        
        myAccount.display();
    }
}