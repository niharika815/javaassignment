import java.util.Scanner;

class Commission {
    private double sales;

    public Commission(double sales) {
        this.sales = sales;
    }

    public double commission() {
        return sales * 0.10; 
    }
}

public class CommissionTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter sales amount: ");
        double salesInput = scanner.nextDouble();

        if (salesInput < 0) {
            System.out.println("Invalid Input");
        } else {
            Commission myCommission = new Commission(salesInput);
            System.out.println("Commission calculated: $" + myCommission.commission());
        }

        scanner.close();
    }
}