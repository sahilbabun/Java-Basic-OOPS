package bank;

public class Bank {
    public static void main(String[] args) {
        Account account = new Account();
        account.name = "customer";
        account.email = "customer@gmail.com";
        account.setPassword("abcd");
        System.out.println(account.getPassword());
    }
}
