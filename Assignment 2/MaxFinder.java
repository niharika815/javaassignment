import java.util.Scanner;

class MaxFinder {
    int num1, num2, num3;

    MaxFinder(int n1, int n2, int n3){
        this.num1 = n1;
        this.num2 = n2;
        this.num3 = n3;
    }

    void findMax(){
        if(num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is the maximum number.");
        } 
        else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is the maximum number.");
        } 
        else {
            System.out.println(num3 + " is the maximum number.");
        }
    } 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        MaxFinder obj = new MaxFinder(a, b, c);
        obj.findMax();

        scanner.close();
    }
}
