package util;

public class CurrencyConverter {
    
    public static double IOF = 0.06;
    public double dollarPrice;
    public double dollarsBought;

    public double calculateAmountPaid() {
        double result = dollarPrice * dollarsBought;
        return result = result + (result * IOF);
    }
}
