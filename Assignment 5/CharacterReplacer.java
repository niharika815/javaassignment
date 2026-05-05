import java.util.Scanner;

public class CharacterReplacer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String result = input.replace('d', 'f');

        System.out.println("Modified string: " + result);

        sc.close();
    }
}