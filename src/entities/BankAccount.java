package entities;

public class BankAccount {
    
    public int accountNumber;
    private String accountOwner;
    private double balance;
    
    public BankAccount(int accountNumber, String accountOwner) {
        this.accountNumber = accountNumber;
        this.accountOwner = accountOwner;
    }

    public BankAccount(int accountNumber, String accountOwner, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountOwner = accountOwner;
        deposit(initialDeposit);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountOwner() {
        return accountOwner;
    }

    public void setAccountOwner(String accountOwner) {
        this.accountOwner = accountOwner;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double deposit) {
        balance += deposit;
    }

    public void withdraw(double withdraw) {
        balance -= withdraw + 5;
    }

    public String toString() {
        return "Account "
                + accountNumber 
                + ", Holder: "
                + accountOwner
                + ", Balance: $ "
                + String.format("%.2f%n", balance);
    }

}
