public class ReverseWords {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a string as command-line arguments.");
            return;
        }

        for (int i = args.length - 1; i >= 0; i--) {
            System.out.print(args[i] + (i == 0 ? "" : " "));
        }
        System.out.println();
    }
}