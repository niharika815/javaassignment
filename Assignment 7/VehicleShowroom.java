abstract class MotorVehicle {
    protected String modelName;
    protected String modelNumber;
    protected double modelPrice;

    public MotorVehicle(String modelName, String modelNumber, double modelPrice) {
        this.modelName = modelName;
        this.modelNumber = modelNumber;
        this.modelPrice = modelPrice;
    }

    public void display() {
        System.out.println("Model Name: " + modelName);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Model Price: $" + modelPrice);
    }
}

class Car extends MotorVehicle {
    private double discountRate;

    public Car(String modelName, String modelNumber, double modelPrice, double discountRate) {
        super(modelName, modelNumber, modelPrice);
        this.discountRate = discountRate;
    }

    public double discount() {
        return modelPrice * (discountRate / 100);
    }

    @Override
    public void display() {
        System.out.println("Car Name: " + modelName);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Price: $" + modelPrice);
        System.out.println("Discount Rate: " + discountRate + "%");
    }
}

public class VehicleShowroom {
    public static void main(String[] args) {
        Car myCar = new Car("Honda Civic", "CV2023", 25000.0, 5.5);
        
        myCar.display();
        
        double discountAmount = myCar.discount();
        System.out.println("Discount Amount: $" + discountAmount);
        
        double finalPrice = myCar.modelPrice - discountAmount;
        System.out.println("Final Price after discount: $" + finalPrice);
    }
}