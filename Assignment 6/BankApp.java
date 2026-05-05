interface Bank {
    void deposit(double amount);
    void withdraw(double amount);
    void displayBalance();
}

class Customer {
    String name;
    int customerId;

    void getCustomerDetails(String name, int id) {
        this.name = name;
        this.customerId = id;
    }

    void showCustomerDetails() {
        System.out.println("Customer Name: " + name);
        System.out.println("Customer ID: " + customerId);
    }
}

class Account {
    int accountNumber;
    double balance;

    void getAccountDetails(int accNo, double bal) {
        this.accountNumber = accNo;
        this.balance = bal;
    }

    void showAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
    }
}

class BankSystem extends Customer implements Bank {
    Account acc = new Account();

    public void deposit(double amount) {
        acc.balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= acc.balance) {
            acc.balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + acc.balance);
    }

    void setupAccount(int accNo, double bal) {
        acc.getAccountDetails(accNo, bal);
    }

    void showAllDetails() {
        showCustomerDetails();
        acc.showAccountDetails();
        displayBalance();
    }
}

public class BankApp {
    public static void main(String[] args) {
        BankSystem user = new BankSystem();

        user.getCustomerDetails("Rahul", 101);
        user.setupAccount(5001, 10000);

        user.deposit(2000);
        user.withdraw(3000);

        System.out.println("\n--- Account Details ---");
        user.showAllDetails();
    }
}