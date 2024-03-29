import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class ProgramAccountE {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int accountNumber = sc.nextInt();
            sc.nextLine();
            System.out.print("Holder: ");
            String holder  = sc.nextLine();
            System.out.print("Initial balance: ");
            double initialBalance  = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit  = sc.nextDouble();

            Account account = new Account(accountNumber, holder, initialBalance, withdrawLimit);

            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            double withdrawValue = sc.nextDouble();
            account.withdraw(withdrawValue);

            System.out.println("New balance: " + account.getBalance());
        } catch (DomainException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }

        sc.close();
    }
}
