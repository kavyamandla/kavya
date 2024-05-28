import java.util.Scanner;

class BankAccount {
    private String accountType;
    private double balance;

    
    public BankAccount(String accountType) {
        this.accountType = accountType;
        this.balance = 0;
    }

    public BankAccount(String accountType, double initialBalance) {
        this.accountType = accountType;
        this.balance = initialBalance;
    }

    
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + " by cash.");
    }

    
    public void deposit(double amount, String checkNumber) {
        balance += amount;
        System.out.println("Deposited $" + amount + " by check (Check Number: " + checkNumber + ").");
    }

    
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + " successfully.");
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    
    public void checkBalance() {
        System.out.println("Current balance in " + accountType + " account: $" + balance);
    }
}

public class bank{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        BankAccount savingsAccount = new BankAccount("Savings Account", 1000);
        savingsAccount.checkBalance();

        
        savingsAccount.deposit(500);
        savingsAccount.checkBalance();

        
        savingsAccount.deposit(300, "123456");
        savingsAccount.checkBalance();

        
        savingsAccount.withdraw(200);
        savingsAccount.checkBalance();

        
        BankAccount checkingAccount = new BankAccount("Checking Account");
        checkingAccount.checkBalance();

       
        checkingAccount.deposit(1000);
        checkingAccount.checkBalance();

        scanner.close();
    }
}
