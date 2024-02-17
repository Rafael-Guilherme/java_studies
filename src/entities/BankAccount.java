package entities;

public class BankAccount {
    
    public int accountNumber;
    private String accountOwner;
    private double initialDeposit;
    
    public BankAccount(int accountNumber, String accountOwner, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountOwner = accountOwner;
        this.initialDeposit = initialDeposit;
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

    public double getInitialDeposit() {
        return initialDeposit;
    }

    public void deposit(double deposit) {
        this.initialDeposit += deposit;
    }

    public void withdraw(double withdraw) {
        this.initialDeposit = initialDeposit - withdraw - 5;
    }

}
