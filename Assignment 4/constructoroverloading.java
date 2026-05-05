class constructoroverloading {
    int length;
    int width;
    int height;

    constructoroverloading() {
        length = 0;
        width = 0;
        height = 0;
    }

    constructoroverloading(int l) {
        length = l;
        width = l;
        height = l;
    }

    constructoroverloading(int l, int w, int h) {
        length = l;
        width = w;
        height = h;
    }

    void display() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println();
    }

    public static void main(String[] args) {
        constructoroverloading b1 = new constructoroverloading();
        constructoroverloading b2 = new constructoroverloading(5);
        constructoroverloading b3 = new constructoroverloading(5, 6, 7);

        b1.display();
        b2.display();
        b3.display();
    }
}