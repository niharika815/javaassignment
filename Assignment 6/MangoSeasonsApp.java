interface Mango {
    void seasonDetails();
}

class Winter implements Mango {
    public void seasonDetails() {
        System.out.println("Winter: Mangoes are mostly out of season, relying on cold storage or imported varieties.");
    }
}

class Summer implements Mango {
    public void seasonDetails() {
        System.out.println("Summer: This is the peak season for fresh, sweet mangoes like Alphonso and Dasheri.");
    }
}

public class MangoSeasonsApp {
    public static void main(String[] args) {
        Mango summerMango = new Summer();
        Mango winterMango = new Winter();

        System.out.println("--- Mango Availability by Season ---");
        summerMango.seasonDetails();
        winterMango.seasonDetails();
    }
}