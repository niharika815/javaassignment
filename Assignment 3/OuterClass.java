/*write a java program to demonstrate inner class*/ 
class OuterClass {

    private String message = "Hello from Outer Class";

    class InnerClass {
        void display() {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();
    }
}
