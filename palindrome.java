public class palindrome {
    public static void main(String[] args) {
        String input;

        if (args.length > 0) {
            input = args[0];
        } else {
            input = "Level"; // default value
        }

        String cleaned = input.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();

        if (cleaned.equals(reversed)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}