import java.util.Scanner;

public class prgm9 {
    public static void main(String[] args) {
        Scanner scanner_054 = new Scanner(System.in);
        System.out.print("Enter three digits: ");
        int digit1_054 = scanner_054.nextInt();
        int digit2_054 = scanner_054.nextInt();
        int digit3_054 = scanner_054.nextInt();

        System.out.println("All possible combinations:");
        printCombinations_054(digit1_054, digit2_054, digit3_054);

        scanner_054.close();
    }

    public static void printCombinations_054(int digit1_054, int digit2_054, int digit3_054) {
        for (int i_054 = 1; i_054 <= 3; i_054++) {
            for (int j_054 = 1; j_054 <= 3; j_054++) {
                for (int k_054 = 1; k_054 <= 3; k_054++) {
                    if (i_054!= j_054 && i_054 != k_054 && j_054 != k_054) {
                        System.out.println(digit1_054 + "" + digit2_054 + "" + digit3_054);
                    }
                }
            }
        }
    }
}

