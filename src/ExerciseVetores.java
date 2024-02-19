import java.util.Locale;
import java.util.Scanner;


public class ExerciseVetores {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual é o tamanho da lista de número: ");
        int n = sc.nextInt();

        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }

            System.out.print("Valores = ");
        for (int i = 0; i < vect.length; i++) {
            System.out.printf("%d  ", vect[i]);
        }

        int maiorValor = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] > maiorValor) {
                maiorValor = vect[i];
            }
        }
        System.out.println("Maior valor = " + maiorValor);

        int countNumerosPares = 0;
        int numerosPares = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] % 2 == 0) {
                numerosPares += vect[i];
                countNumerosPares += 1;
            }
        }

        if (countNumerosPares != 0) {
            int mediaNumerosPares = numerosPares / countNumerosPares;
            System.out.println("Media números pares: " + mediaNumerosPares);
        } else {
            System.out.println("Nenhum número par");
        }

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < 0) {
                System.out.print("Numeros negativos: ");
                System.out.println(vect[i]);
            }
        }
      
        sc.close();
    }
}
