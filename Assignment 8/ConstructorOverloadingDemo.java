class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        length = 1.0;
        width = 1.0;
    }

    public Rectangle(double side) {
        length = side;
        width = side;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
}

public class ConstructorOverloadingDemo {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        System.out.println("Area of rect1 (default): " + rect1.calculateArea());

        Rectangle rect2 = new Rectangle(5.0);
        System.out.println("Area of rect2 (square): " + rect2.calculateArea());

        Rectangle rect3 = new Rectangle(4.0, 6.0);
        System.out.println("Area of rect3 (custom rectangle): " + rect3.calculateArea());
    }
}