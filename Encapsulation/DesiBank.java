package Encapsulation;

public class DesiBank {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(500);
        acc.deposit(1200);
        acc.withdraw(150);
        System.out.println("Current Balance: " + acc.getBalance());
    }
}
