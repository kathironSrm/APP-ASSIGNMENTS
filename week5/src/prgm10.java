import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class prgm10 {
    public static void main(String[] args) {
        Scanner scanner_054 = new Scanner(System.in);
        int[] array_054 = new int[15];

        System.out.println("Enter 15 elements:");
        for (int i_054 = 0; i_054 < 15; i_054++) {
            array_054[i_054] = scanner_054.nextInt();
        }

        int uniqueCount_054 = countUniqueValues_054(array_054);

        System.out.println("Number of unique values: " + uniqueCount_054);

        scanner_054.close();
    }
    public static int countUniqueValues_054(int[] arr_054) {
        Set<Integer> uniqueValues_054 = new HashSet<>();
        for (int num_054 : arr_054) {
            uniqueValues_054.add(num_054);
        }
        return uniqueValues_054.size();
    }
}
