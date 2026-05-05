class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class OverrideDemo {
    public static void main(String[] args) {
        Animal a = new Dog(); // parent reference
        a.sound();
    }
}