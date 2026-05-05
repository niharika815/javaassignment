import java.util.Scanner;

class Tender {
    double cost;
    String companyName;

    Tender(double cost, String companyName) {
        this.cost = cost;
        this.companyName = companyName;
    }
}

public class TenderApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tender[] tenders = new Tender[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter company name for tender " + (i + 1) + ": ");
            String name = sc.next();
            System.out.print("Enter cost for tender " + (i + 1) + ": ");
            double cost = sc.nextDouble();
            tenders[i] = new Tender(cost, name);
        }

        int minIndex = 0;
        for (int i = 1; i < 5; i++) {
            if (tenders[i].cost < tenders[minIndex].cost) {
                minIndex = i;
            }
        }

        System.out.println("\nCompany with the minimum cost: " + tenders[minIndex].companyName);
        sc.close();
    }
}