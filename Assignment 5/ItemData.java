import java.util.Scanner;

class Item {
    int code;
    double price;

    Item(int code, double price) {
        this.code = code;
        this.price = price;
    }
}

public class ItemData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Item[] items = new Item[5];
        double total = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter code for item " + (i + 1) + ": ");
            int c = sc.nextInt();
            System.out.print("Enter price for item " + (i + 1) + ": ");
            double p = sc.nextDouble();
            items[i] = new Item(c, p);
            total += p;
        }

        System.out.println("\nCode\tPrice");
        System.out.println("-----------------");
        for (int i = 0; i < 5; i++) {
            System.out.println(items[i].code + "\t" + items[i].price);
        }
        System.out.println("-----------------");
        System.out.println("Total Price: " + total);
        
        sc.close();
    }
}