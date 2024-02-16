import java.util.Locale;
import java.util.Scanner;

import entities.Empregado;

public class ProgramFuncionario {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Empregado empregado = new Empregado();

        System.out.println("Entre os dados do funcionario abaixo:");
        System.out.print("Nome: ");
        empregado.nome = sc.nextLine();
        System.out.print("Salário bruto: ");
        empregado.salarioBruto = sc.nextDouble();
        System.out.print("Imposto: ");
        empregado.imposto = sc.nextDouble();
        System.out.println(" ");

        System.out.printf("Empregado: %s, R$ %.2f%n", empregado.nome, empregado.salarioLiquido());
        System.out.println(" ");

        System.out.print("Qual é a porcentagem de aumento? ");
        double porcentagem = sc.nextDouble();
        empregado.aumentoSalarial(porcentagem);
        System.out.println(" ");

        System.out.printf("Dados atualizados: %s, R$ %.2f%n", empregado.nome, empregado.salarioLiquido());

        sc.close();
    }
}
