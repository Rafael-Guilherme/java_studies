import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;



public class ProgramBank {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        BankAccount bankAccount;


        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String accountHolder = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char answerDeposit = sc.next().charAt(0);

        double initialDeposit;
        if (answerDeposit == 'y') {
            System.out.print("Enter initial deposit value: ");
            initialDeposit = sc.nextDouble();
            bankAccount = new BankAccount(accountNumber, accountHolder, initialDeposit);
        } else {
            bankAccount = new BankAccount(accountNumber, accountHolder);
        }

        System.out.println(" ");

        System.out.println("Account Data:");
        System.out.println(bankAccount);
        System.out.println(" ");

        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        bankAccount.deposit(depositValue);

        System.out.println("Updated account data:");
        System.out.println(bankAccount);
        System.out.println(" ");

        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        bankAccount.withdraw(withdrawValue);

        System.out.println("Updated account data:");
        System.out.println(bankAccount);

        sc.close();
    }
}
