import java.util.Scanner;

public class StringStatistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int upper = 0, lower = 0, digits = 0, spaces = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isUpperCase(ch)) {
                upper++;
            } else if (Character.isLowerCase(ch)) {
                lower++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else if (ch == ' ') {
                spaces++;
            }
        }

        System.out.println("Count of uppercase character: " + upper);
        System.out.println("Count of lowercase character: " + lower);
        System.out.println("Count of digits: " + digits);
        System.out.println("Count of spaces: " + spaces);
        
        sc.close();
    }
}