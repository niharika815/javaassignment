abstract class Asset {
    protected String descriptor;
    protected String date;
    protected double current_value;

    public Asset(String descriptor, String date, double current_value) {
        this.descriptor = descriptor;
        this.date = date;
        this.current_value = current_value;
    }

    public abstract void displayDetails();
}

class Stock extends Asset {
    private int num_shares;
    private double share_price;
    private String asset;

    public Stock(String descriptor, String date, double current_value, int num_shares, double share_price, String asset) {
        super(descriptor, date, current_value);
        this.num_shares = num_shares;
        this.share_price = share_price;
        this.asset = asset;
    }

    @Override
    public void displayDetails() {
        System.out.println("--- Stock Details ---");
        System.out.println("Descriptor: " + descriptor);
        System.out.println("Date: " + date);
        System.out.println("Current Value: $" + current_value);
        System.out.println("Asset: " + asset);
        System.out.println("Number of Shares: " + num_shares);
        System.out.println("Share Price: $" + share_price);
        System.out.println();
    }
}

class Bond extends Asset {
    private double interest_rate;
    private String asset;

    public Bond(String descriptor, String date, double current_value, double interest_rate, String asset) {
        super(descriptor, date, current_value);
        this.interest_rate = interest_rate;
        this.asset = asset;
    }

    @Override
    public void displayDetails() {
        System.out.println("--- Bond Details ---");
        System.out.println("Descriptor: " + descriptor);
        System.out.println("Date: " + date);
        System.out.println("Current Value: $" + current_value);
        System.out.println("Asset: " + asset);
        System.out.println("Interest Rate: " + interest_rate + "%");
        System.out.println();
    }
}

class Savings extends Asset {
    private double interest_rate;
    private String asset;

    public Savings(String descriptor, String date, double current_value, double interest_rate, String asset) {
        super(descriptor, date, current_value);
        this.interest_rate = interest_rate;
        this.asset = asset;
    }

    @Override
    public void displayDetails() {
        System.out.println("--- Savings Details ---");
        System.out.println("Descriptor: " + descriptor);
        System.out.println("Date: " + date);
        System.out.println("Current Value: $" + current_value);
        System.out.println("Asset: " + asset);
        System.out.println("Interest Rate: " + interest_rate + "%");
        System.out.println();
    }
}

public class AssetPortfolioManager {
    public static void main(String[] args) {
        Asset myStock = new Stock("Technology Stock", "2023-11-15", 15000.00, 100, 150.00, "AAPL Equities");
        Asset myBond = new Bond("Government Bond", "2023-11-15", 5000.00, 4.5, "US Treasury");
        Asset mySavings = new Savings("Emergency Fund", "2023-11-15", 25000.00, 3.2, "High-Yield Bank Account");

        myStock.displayDetails();
        myBond.displayDetails();
        mySavings.displayDetails();
    }
}