import java.util.Scanner;

abstract class ThreeDObject {
    abstract double wholeSurfaceArea();
    abstract double volume();
}

class Box extends ThreeDObject {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    double wholeSurfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }

    @Override
    double volume() {
        return length * width * height;
    }
}

class Cube extends ThreeDObject {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    double wholeSurfaceArea() {
        return 6 * side * side;
    }

    @Override
    double volume() {
        return side * side * side;
    }
}

class Cylinder extends ThreeDObject {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    double wholeSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    double volume() {
        return Math.PI * radius * radius * height;
    }
}

class Cone extends ThreeDObject {
    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    double wholeSurfaceArea() {
        double slantHeight = Math.sqrt((radius * radius) + (height * height));
        return Math.PI * radius * (radius + slantHeight);
    }

    @Override
    double volume() {
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }
}

public class GeometryTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ThreeDObject shape;

        System.out.println("Enter dimensions for Box (length width height): ");
        double l = scanner.nextDouble();
        double w = scanner.nextDouble();
        double h = scanner.nextDouble();
        shape = new Box(l, w, h);
        System.out.println("Box Surface Area: " + shape.wholeSurfaceArea());
        System.out.println("Box Volume: " + shape.volume());

        System.out.println("\nEnter dimension for Cube (side): ");
        double s = scanner.nextDouble();
        shape = new Cube(s);
        System.out.println("Cube Surface Area: " + shape.wholeSurfaceArea());
        System.out.println("Cube Volume: " + shape.volume());

        System.out.println("\nEnter dimensions for Cylinder (radius height): ");
        double cylRadius = scanner.nextDouble();
        double cylHeight = scanner.nextDouble();
        shape = new Cylinder(cylRadius, cylHeight);
        System.out.println("Cylinder Surface Area: " + shape.wholeSurfaceArea());
        System.out.println("Cylinder Volume: " + shape.volume());

        System.out.println("\nEnter dimensions for Cone (radius height): ");
        double coneRadius = scanner.nextDouble();
        double coneHeight = scanner.nextDouble();
        shape = new Cone(coneRadius, coneHeight);
        System.out.println("Cone Surface Area: " + shape.wholeSurfaceArea());
        System.out.println("Cone Volume: " + shape.volume());

        scanner.close();
    }
}