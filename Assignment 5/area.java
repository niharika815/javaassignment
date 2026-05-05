class Point {
    private double x;
    private double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        return "(" + x + "," + y + ")" ; 
    }
}

class Circle {
   private Point center;
   private double radius;

   public Circle(Point center, double radius){
        this.center = center;
        this.radius = radius;
   }

   public double calculateArea(){
        return Math.PI * radius * radius;
   }

   public void displayInfo(){
        System.out.println("Circle Details: ");
        System.out.println("- Center: " + center);
        System.out.println("- Radius: " + radius);
        System.out.println("- Area: " + String.format("%.2f", calculateArea()));
   }
}

public class area {
    public static void main(String[] args) {
        Point myPoint = new Point(3.5, 4.0);
        Circle myCircle = new Circle(myPoint, 5.0);
        myCircle.displayInfo();   
    }
}