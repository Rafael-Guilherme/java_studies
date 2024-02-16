import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class ProgramCalculateDollar {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        CurrencyConverter currencyConverter = new CurrencyConverter();

        System.out.print("What is the dollar price? ");
        currencyConverter.dollarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        currencyConverter.dollarsBought = sc.nextDouble();

        System.out.printf("Amount to be paid in reais = %.2f%n",  currencyConverter.calculateAmountPaid());

        sc.close();
    }
}
