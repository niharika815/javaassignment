import java.util.Scanner;
class NumberCheck{
    int number;
    NumberCheck(int n) {
        this.number = n;
    }
    void checkSign() {
        if (number > 0) {
            System.out.println(number +  " is Positive");
        } else if (number < 0) {
            System.out.println(number + " is Negative");
        } else {
            System.out.println(number + " is Zero");
        }
    }
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int input = scanner.nextInt();
        NumberCheck obj =  new NumberCheck(input);
        obj.checkSign();

        scanner.close();
    }
}