import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

abstract class AbstractProduct {
    protected String productId;
    protected String name;
    protected String description;

    public AbstractProduct(String productId, String name, String description) {
        this.productId = productId;
        this.name = name;
        this.description = description;
    }

    public String getProductId() {
        return productId;
    }

    public abstract void display();
}

class Product extends AbstractProduct {
    protected double price;

    public Product(String productId, String name, String description, double price) {
        super(productId, name, description);
        this.price = price;
    }

    @Override
    public void display() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Price: $" + price);
    }
}

class Book extends Product {
    protected String isbn;
    protected String author;
    protected String title;

    public Book(String productId, String name, String description, double price, String isbn, String author, String title) {
        super(productId, name, description, price);
        this.isbn = isbn;
        this.author = author;
        this.title = title;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("ISBN: " + isbn);
        System.out.println("Author: " + author);
        System.out.println("Book Title: " + title);
    }
}

class TravelGuide extends Book {
    protected String country;

    public TravelGuide(String productId, String name, String description, double price, String isbn, String author, String title, String country) {
        super(productId, name, description, price, isbn, author, title);
        this.country = country;
    }

    @Override
    public void display() {
        System.out.println("\n--- Travel Guide Details ---");
        super.display();
        System.out.println("Country: " + country);
    }
}

class CompactDisc extends Product {
    protected String artist;
    protected String title;

    public CompactDisc(String productId, String name, String description, double price, String artist, String title) {
        super(productId, name, description, price);
        this.artist = artist;
        this.title = title;
    }

    @Override
    public void display() {
        System.out.println("\n--- Compact Disc Details ---");
        super.display();
        System.out.println("Artist: " + artist);
        System.out.println("CD Title: " + title);
    }
}

public class ProductInventorySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, AbstractProduct> inventory = new HashMap<>();

        System.out.println("Enter details for a TRAVEL GUIDE:");
        System.out.print("Product ID: ");
        String tgId = scanner.nextLine();
        System.out.print("Name: ");
        String tgName = scanner.nextLine();
        System.out.print("Description: ");
        String tgDesc = scanner.nextLine();
        System.out.print("Price: ");
        double tgPrice = Double.parseDouble(scanner.nextLine());
        System.out.print("ISBN: ");
        String tgIsbn = scanner.nextLine();
        System.out.print("Author: ");
        String tgAuthor = scanner.nextLine();
        System.out.print("Title: ");
        String tgTitle = scanner.nextLine();
        System.out.print("Country: ");
        String tgCountry = scanner.nextLine();

        TravelGuide guide = new TravelGuide(tgId, tgName, tgDesc, tgPrice, tgIsbn, tgAuthor, tgTitle, tgCountry);
        inventory.put(guide.getProductId(), guide);

        System.out.println("\nEnter details for a COMPACT DISC:");
        System.out.print("Product ID: ");
        String cdId = scanner.nextLine();
        System.out.print("Name: ");
        String cdName = scanner.nextLine();
        System.out.print("Description: ");
        String cdDesc = scanner.nextLine();
        System.out.print("Price: ");
        double cdPrice = Double.parseDouble(scanner.nextLine());
        System.out.print("Artist: ");
        String cdArtist = scanner.nextLine();
        System.out.print("Title: ");
        String cdTitle = scanner.nextLine();

        CompactDisc cd = new CompactDisc(cdId, cdName, cdDesc, cdPrice, cdArtist, cdTitle);
        inventory.put(cd.getProductId(), cd);

        System.out.println("\n==================================");
        System.out.print("Enter Product ID to retrieve and display details: ");
        String searchId = scanner.nextLine();

        if (inventory.containsKey(searchId)) {
            inventory.get(searchId).display();
        } else {
            System.out.println("\nProduct with ID '" + searchId + "' not found in inventory.");
        }

        scanner.close();
    }
}