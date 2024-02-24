import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Item;
import entities.ItemImported;
import entities.ItemUsed;

public class ProgramProducts {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Item> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char p = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            if (p == 'i') {
                System.out.print("Customs fee: ");
                double fee = sc.nextDouble();
                Item item = new ItemImported(name, price, fee);
                list.add(item);
            } else if (p == 'u') {
                System.out.print("Manufacture Date (DD/MM/YYYY): ");
                Date manufacDate = sdf.parse(sc.next());
                Item item = new ItemUsed(name, price, manufacDate);
                list.add(item);
            } else {
                Item item = new Item(name, price);
                list.add(item);
            }

            
        }

        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Item i : list) {
            System.out.println(i.priceTag());
        }

        sc.close();
    }
}
