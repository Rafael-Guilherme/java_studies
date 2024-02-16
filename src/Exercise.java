import java.util.Locale;
import java.util.Scanner;

public class Exercise {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Exercise 1:
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = y + x;

        System.out.printf("A soma de %d e %d é %d", x, y, z);
        System.out.println(" ");

        // Exercise 2:
        double raio = sc.nextDouble();

        double area = 3.14159 * Math.pow(raio, raio);

        System.out.printf("A área do raio %.2f é igual a %.4f", raio, area);
        System.out.println(" ");
        
        // Exercise 3:
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        
        int diferenca = ((A * B) - (C * D));

        System.out.printf("A multiplicação de %d por %d menos a multiplicação de %d por %d é igual a %d", A, B, C, D, diferenca);
        System.out.println(" ");

        // Exercise 4:
        Locale.setDefault(Locale.US);
        int numeroFuncionario = sc.nextInt();
        int numeroDeHorasTrabalhadas = sc.nextInt();
        double valorPorHora = sc.nextDouble();

        double salario = (double) numeroDeHorasTrabalhadas * valorPorHora;

        System.out.printf("O número do funcionário é %d e o seu salário é U$ %.2f", numeroFuncionario, salario);
        System.out.println("");

        // Exercise 5:
        Locale.setDefault(Locale.US);
        int codigoPeca1 = sc.nextInt();
        int numeroPeca1 = sc.nextInt();
        double valorPeca1 = sc.nextDouble();

        int codigoPeca2 = sc.nextInt();
        int numeroPeca2 = sc.nextInt();
        double valorPeca2 = sc.nextDouble();

        double valorTotal = (numeroPeca1 * valorPeca1) + (numeroPeca2 * valorPeca2);

        System.out.printf("O valor total das peças de código %d e %d a ser pago é: %.2f", codigoPeca1, codigoPeca2, valorTotal);
        System.out.println("");

        //Exercise 6:
        Locale.setDefault(Locale.US);
        double E = sc.nextDouble();
        double F = sc.nextDouble();
        double G = sc.nextDouble();

        double areaTriangulo = E * G /2;
        double areaCirculo = 3.14159 * Math.pow(G, G);
        double areaTrapezio = ((E + F) * G) / 2;
        double areaQuadrado = F * F;
        double areaRetangulo = E * F;

        System.out.printf("Triângulo: %.3f%n", areaTriangulo);
        System.out.printf("Círculo: %.3f%n", areaCirculo);
        System.out.printf("Trapênzio: %.3f%n", areaTrapezio);
        System.out.printf("Quadrado: %.3f%n", areaQuadrado);
        System.out.printf("Retângulo: %.3f%n", areaRetangulo);

        sc.close();
    }
}
