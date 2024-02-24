import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Payers;
import entities.PayersCompany;
import entities.PayersIndividual;

public class ProgramPayers {
     public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<Payers> payers = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char p = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Annual incomme: ");
            double annualIncome = sc.nextDouble();

            if(p == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();

                Payers payer = new PayersIndividual(name, annualIncome, healthExpenditures);
                payers.add(payer);
            } else {
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();

                Payers payer = new PayersCompany(name, annualIncome, numberOfEmployees);
                payers.add(payer);
            }
        }

        System.out.println();
        System.out.println("TAXES PAID: ");
        double sumTaxes = 0.00;
        for (Payers p : payers) {
            System.out.println(p.getName() + ": $ " + String.format("%.2f", p.taxesPaid()));
            sumTaxes += p.taxesPaid();
        }

        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sumTaxes));


        

        sc.close();
    }
}
