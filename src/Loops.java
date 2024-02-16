import java.util.Locale;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double c;
        char resposta;
        
        do {
            System.out.print("Digite a temperatua em Celsius: ");
    
            c = sc.nextDouble();
            double tempF = (9.0 * c) / 5.0 + 32.0;
            System.out.printf("O equivalente em Fahreinhet é: %.1f%n", tempF);

            System.out.print("Deseja continuar (s/n)?");
            
            resposta = sc.next().charAt(0);
        } while (resposta == 's');
        
        sc.close();
    }
}
