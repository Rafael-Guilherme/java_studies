import java.util.Locale;
import java.util.Scanner;

import entities.ProductVector;

public class ExerciseVetor3 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual é o tamanho do vetor: ");
        int n = sc.nextInt();
        ProductVector[] vect = new ProductVector[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.printf("Digite o nome do produto %d: ", i + 1);
            String name = sc.nextLine();
            System.out.printf("Digite o valor do produto %d: ", i + 1);
            double price = sc.nextDouble();
            vect[i] = new ProductVector(name, price);
        }

        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getPrice();
        }

        double avg = sum / vect.length;

        System.out.printf("AVERAGE PRICE = %.2f%n", avg);

        sc.close();
    }
}
