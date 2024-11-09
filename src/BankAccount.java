public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public synchronized void deposit(double amount) {
        balance = balance + amount;

        System.out.println(Thread.currentThread().getName() + " deposit " + amount + " to account:"+ accountNumber+  " Remaining Balance: " +balance);
    }

    public synchronized void withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println(Thread.currentThread().getName() + " withdraw " + amount + " from account:"+ accountNumber+ " Remaining Balance: " +balance);
        }else {

            System.out.println(Thread.currentThread().getName()+ " withdraw " + amount + " from account:"+ accountNumber+ " Remaining Balance: " +balance);
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

}
