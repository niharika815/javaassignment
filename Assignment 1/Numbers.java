class Numbers {
    int[] arr = {10, 20, 30, 40, 50};

    int sum() { 
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            s = s + arr[i];
        }
        return s;
    }

    void display() {
        int total = sum();
        double avg = total / (double) arr.length;
        
        System.out.println("Sum : " + total);
        System.out.println("Average : " + avg);

    
        if (avg >= 30) {
            System.out.println("Result : Pass");
        } else {
            System.out.println("Result : Fail");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Numbers n = new Numbers();
        n.display();
    }
}