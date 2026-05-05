class PrintName {
String name;
void display() { 
   System.out.println("My Name is: " + name);
}
public static void main(String[] args) {
   PrintName obj = new PrintName(); 
   obj.name = "Rickden"; 
   obj.display(); 
 }
}