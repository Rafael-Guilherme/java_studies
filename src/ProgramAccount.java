import entities.Account;
import entities.BussinessAcount;
import entities.SavingsAccount;

public class ProgramAccount {
    public static void main(String[] args) {

        Account acc = new Account(1001, "Alex", 0.0);
        BussinessAcount bacc = new BussinessAcount(1002, "Maria", 0.0, 500.00);

        // UPCASTING

        Account acc1 = bacc;
        Account acc2 = new BussinessAcount(1003, "Bob", 0.0, 200.00);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        // DOWNCASTING

        BussinessAcount acc4 = (BussinessAcount)acc2;
        acc4.loan(100.0);

        if (acc3 instanceof BussinessAcount) {
            BussinessAcount acc5 = (BussinessAcount)acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }
        
        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount)acc3;
            acc5.updateBalance();
            System.out.println("Update");
        }
    }
}
