import java.util.Scanner;
public class prgm5 {
    public static void main(String[] args) {
        Scanner scanner_054 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number_054 = scanner_054.nextInt();

        boolean isPrime_054 = checkPrime_054(number_054);

        if (isPrime_054) {
            System.out.println("The number is prime.");
        } else {
            System.out.println("The number is not prime.");
        }
        scanner_054.close();
    }
    public static boolean checkPrime_054(int num_054) {
        if (num_054 <= 1) {
            return false;
        }
        for (int i_054 = 2; i_054 <= Math.sqrt(num_054); i_054++) {
            if (num_054 % i_054 == 0) {
                return false;
            }
        }
        return true;
    }
}

