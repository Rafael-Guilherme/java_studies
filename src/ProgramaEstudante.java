import java.util.Locale;
import java.util.Scanner;

import entities.Estudante;

public class ProgramaEstudante {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Estudante estudante = new Estudante();

        System.out.println("Informe seu nome, nota1, nota2 e nota3 abaixo: ");
        estudante.nome = sc.nextLine();
        estudante.nota1 = sc.nextDouble();
        estudante.nota2 = sc.nextDouble();
        estudante.nota3 = sc.nextDouble();

        System.out.println("Nota final: " + estudante.notaFinal());
        System.out.println(estudante.calcularResultado());

        sc.close();
    }
}
