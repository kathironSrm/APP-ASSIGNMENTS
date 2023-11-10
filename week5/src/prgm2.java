import java.util.Scanner;

class prgm2 {
    public static void main(String[] args) {
        Scanner scanner_054 = new Scanner(System.in);

        System.out.print("Enter string 1: ");
        String str1_054 = scanner_054.nextLine();

        System.out.print("Enter string 2: ");
        String str2_054 = scanner_054.nextLine();

        boolean areRotationallyEquivalent_054= checkRotationalEquivalence_054(str1_054, str2_054);

        System.out.println("Are two strings Rotationally equal? : " + areRotationallyEquivalent_054);

        scanner_054.close();
    }

    public static boolean checkRotationalEquivalence_054(String str1_054, String str2_054) {
        if (str1_054.length() != str2_054.length()) {
            return false;
        }

        String concatenated_028 = str1_054 + str1_054;

        return concatenated_028.contains(str2_054);
    }
}
