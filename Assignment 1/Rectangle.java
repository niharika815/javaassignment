class Rectangle {
double length, width; 
void calculate() { 
double area = length * width; 
double perimeter = 2 * (length + width); 
System.out.println("Area = " + area); 
System.out.println("Perimeter = " + perimeter); 
}
public static void main(String[] args) {
Rectangle obj = new Rectangle(); 
obj.length = 10; 
obj.width = 5; 
obj.calculate(); 
}
}