import java.util.Scanner;

public class prgm7 {
    public static void main(String[] args) {
        Scanner scanner_054 = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int num1_054 = scanner_054.nextInt();

        System.out.print("Enter the second integer: ");
        int num2_054 = scanner_054.nextInt();

        boolean result_054 = checkConditions_054(num1_054, num2_054);

        System.out.println("Result: " + result_054);

        scanner_054.close();
    }

    public static boolean checkConditions_054(int a_054, int b_054) {
        return (a_054 == b_054) || (Math.abs(a_054 - b_054) == 5) || (a_054 + b_054 == 5);
    }
}
