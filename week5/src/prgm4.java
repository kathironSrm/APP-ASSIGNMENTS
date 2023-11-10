import java.util.Scanner;

public class prgm4 {
    public static void main(String[] args) {
        Scanner scanner_054= new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input_054 = scanner_054.nextLine();

        boolean isPalindrome_054 = checkPalindrome_054(input_054);

        if (isPalindrome_054) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        scanner_054.close();
    }

    public static boolean checkPalindrome_054(String str_054) {
        int length_054 = str_054.length();
        for (int i_054 = 0; i_054 < length_054 / 2; i_054++) {
            if (str_054.charAt(i_054) != str_054.charAt(length_054 - i_054 - 1)) {
                return false;
            }
        }
        return true;
    }
}

