import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class ProgramTrabalhadores {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();
        sc.nextLine();

        List<Funcionario> funcionarios = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            Funcionario funcionario = new Funcionario(id, name, salary);
            funcionarios.add(funcionario);
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int employeeId = sc.nextInt();
        Funcionario emp = funcionarios.stream().filter(x -> x.getId() == employeeId).findFirst().orElse(null);
        
        if (employeeId != emp.getId()) {
            System.out.println("This id does not exist");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();

            emp.aumentoSalario(percentage);
        }

        System.out.println();
        System.out.println("List of employees: ");
        for (Funcionario e: funcionarios) {
            System.out.println(e);
        }
        

        sc.close();
    }
}
