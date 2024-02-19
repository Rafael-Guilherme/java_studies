import java.util.Locale;
import java.util.Scanner;

import entities.Pessoas;

public class ExerciseVetores2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas: ");
        int n = sc.nextInt();
        Pessoas[] pessoas = new Pessoas[n];

        for (int i = 0; i < pessoas.length; i++) {
            System.out.printf("Altura da pessoa %d: ", i + 1);
            double altura = sc.nextDouble();
            System.out.printf("Genero da pessoa (M/F) %d: ", i + 1);
            char genero = sc.next().toLowerCase().charAt(0);
            pessoas[i] = new Pessoas(altura, genero);
        }

        double menorAltura = 3.00;
        for (int i = 0; i < pessoas.length; i++) {
            if(pessoas[i].getAltura() < menorAltura) {
                menorAltura = pessoas[i].getAltura();
            }
        }

        System.out.println("Menor altura = " + menorAltura);

        double maiorAltura = 0.00;
        for (int i = 0; i < pessoas.length; i++) {
            if(pessoas[i].getAltura() > maiorAltura) {
                maiorAltura = pessoas[i].getAltura();
            }
        }

        System.out.println("Maior altura = " + maiorAltura);

        double somaAlturaMulheres = 0.00;
        int countadorMulheres = 0;
        for (int i = 0; i < pessoas.length; i++) {
            if(pessoas[i].getGenero() == 'f') {
                somaAlturaMulheres += pessoas[i].getAltura();
                countadorMulheres += 1;
            }
        }

        double mediaAlturaMulheres =  somaAlturaMulheres / countadorMulheres;

        System.out.printf("Média das alturas das mulheres = %.2f%n", mediaAlturaMulheres);


        int contadorHomens = 0;
        for (int i = 0; i < pessoas.length; i++) {
            if(pessoas[i].getGenero() == 'm') {
                contadorHomens += 1;
            }
        }

        System.out.println("Número de homens = " + contadorHomens);

         
        sc.close();
    }
}
