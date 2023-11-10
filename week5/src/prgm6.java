import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class prgm6 {
    public static void main(String[] args) {
        Scanner scanner_054 = new Scanner(System.in);
        System.out.print("Enter a mobile number: ");
        String mobileNumber_054 = scanner_054.nextLine();
        Set<Character> missingDigits_054 = findMissingDigits_054(mobileNumber_054);
        System.out.println("Digits absent in the mobile number:");
        for (char digit_054 : missingDigits_054) {
            System.out.print(digit_054 + " ");
        }
        scanner_054.close();
    }
    public static Set<Character> findMissingDigits_054(String number_054) {
        Set<Character> allDigits_054 = new HashSet<>();
        for (char digit_054 = '0'; digit_054 <= '9'; digit_054++) {
            allDigits_054.add(digit_054);
        }
        Set<Character> presentDigits_054 = new HashSet<>();
        for (char digit_054 : number_054.toCharArray()) {
            presentDigits_054.add(digit_054);
        }
        allDigits_054.removeAll(presentDigits_054);
        return allDigits_054;
    }
}
