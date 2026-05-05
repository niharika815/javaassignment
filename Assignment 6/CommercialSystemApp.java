interface SalesDepartment {
    void processSale(double amount);
}

interface FinanceDepartment {
    void generateInvoice(String clientName, double amount);
}

class CommercialExecutive implements SalesDepartment, FinanceDepartment {
    double totalSalesAmount = 0.0;
    int totalInvoices = 0;

    public void processSale(double amount) {
        totalSalesAmount += amount;
        System.out.println("Sale Processed: $" + amount);
        System.out.println("Confirmation: The sale transaction was completed successfully.");
    }

    public void generateInvoice(String clientName, double amount) {
        totalInvoices++;
        System.out.println("Invoice Generated for Client: " + clientName);
        System.out.println("Invoice Amount: $" + amount);
        System.out.println("Status: Invoice sent to billing.");
    }

    void showSummary() {
        System.out.println("--- Executive Operations Summary ---");
        System.out.println("Total Sales Revenue Processed: $" + totalSalesAmount);
        System.out.println("Total Invoices Generated: " + totalInvoices);
    }
}

public class CommercialSystemApp {
    public static void main(String[] args) {
        CommercialExecutive executive = new CommercialExecutive();

        System.out.println("--- Initiating Commercial Operations ---\n");

        executive.processSale(5500.75);
        System.out.println();
        executive.generateInvoice("Tech Solutions Ltd.", 5500.75);
        
        System.out.println("\n----------------------------------------\n");

        executive.processSale(3200.00);
        System.out.println();
        executive.generateInvoice("Global Enterprises", 3200.00);

        System.out.println("\n----------------------------------------\n");

        executive.showSummary();
    }
}