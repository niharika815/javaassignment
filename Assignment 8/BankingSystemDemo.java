class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: $" + balance);
    }
}

class SavingsAccount extends BankAccount {
    protected double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest added: $" + interest);
    }
}

class FixedDepositAccount extends SavingsAccount {
    private int maturityPeriod;

    public FixedDepositAccount(String accountNumber, double balance, double interestRate, int maturityPeriod) {
        super(accountNumber, balance, interestRate);
        this.maturityPeriod = maturityPeriod;
    }

    public double calculateMaturityAmount() {
        return balance + (balance * (interestRate / 100) * (maturityPeriod / 12.0));
    }
    
    public int getMaturityPeriod() {
        return maturityPeriod;
    }
}

public class BankingSystemDemo {
    public static void main(String[] args) {
        FixedDepositAccount fdAccount = new FixedDepositAccount("FD10293847", 15000.0, 6.5, 36);

        System.out.println("--- Initial Account Details ---");
        fdAccount.displayBalance();

        System.out.println("\n--- Performing Transactions ---");
        fdAccount.deposit(5000.0);
        fdAccount.displayBalance();

        fdAccount.addInterest();
        fdAccount.displayBalance();

        System.out.println("\n--- Maturity Details ---");
        double maturityAmount = fdAccount.calculateMaturityAmount();
        System.out.println("Estimated Maturity Amount after " + fdAccount.getMaturityPeriod() + " months: $" + maturityAmount);
    }
}