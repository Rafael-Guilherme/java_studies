import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;



public class ProgramBank {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String accountHolder = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char answerDeposit = sc.next().charAt(0);

        double initialDeposit;
        if (answerDeposit == 'y') {
            System.out.print("Enter initial deposit value: ");
            initialDeposit = sc.nextDouble();
        } else {
            System.out.print("Enter initial deposit value: ");
            initialDeposit = 0.00;
        }

        BankAccount bankAccount = new BankAccount(accountNumber, accountHolder, initialDeposit);
        System.out.println(" ");

        System.out.println("Account Data:");
        System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n", bankAccount.getAccountNumber(), bankAccount.getAccountOwner(), bankAccount.getInitialDeposit());
        System.out.println(" ");

        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        bankAccount.deposit(depositValue);

        System.out.println("Updated account data:");
        System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n", bankAccount.getAccountNumber(), bankAccount.getAccountOwner(), bankAccount.getInitialDeposit());
        System.out.println(" ");

        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        bankAccount.withdraw(withdrawValue);

        System.out.println("Updated account data:");
        System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n", bankAccount.getAccountNumber(), bankAccount.getAccountOwner(), bankAccount.getInitialDeposit());

        sc.close();
    }
}
