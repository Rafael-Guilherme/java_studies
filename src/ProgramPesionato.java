import java.util.Locale;
import java.util.Scanner;

import entities.Moradores;



public class ProgramPesionato {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int roomsRenteded = sc.nextInt();
        sc.nextLine();
        Moradores[] moradores = new Moradores[10];

        for (int i = 0; i < roomsRenteded; i++) {
            System.out.printf("Rent #%d:%n", i + 1);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            sc.nextLine();
            moradores[room] = new Moradores(name, email, room);
        }

        System.out.println("Busy rooms:");
        for (int i = 0; i < moradores.length; i++) {
            if (moradores[i] != null) {
                System.out.printf("%d: %s, %s %n", moradores[i].getRoom(), moradores[i].getName(), moradores[i].getEmail());
            }
        }

         
        sc.close();
    }
}
