package Encapsulation;

public class BankAccount {
    private double balance;

    // Constructor to initialize balance
    public BankAccount(double initialBalance){
        if(initialBalance > 0){
            this.balance = initialBalance;
        } else {
            System.out.println("Initial Balance must be positive..!!");
        }
    }

    // Method to deposit a money
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        } else {
            System.out.println("Deposit Amount must be positive..!!");
        }
    }

    // Method to withdraw a money
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
        } else {
            System.out.println("Invalid withdraw amount..!!");
        }
    }

    // Method to check balance
    public double getBalance(){
        return balance;
    }
}
