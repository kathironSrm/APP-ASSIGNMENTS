import java.util.ArrayList;
import java.util.List;

public class prgm3 {
    public static void main(String[] args) {
        List<Integer> numbers_054 = new ArrayList<>();
        numbers_054.add(5);
        numbers_054.add(12);
        numbers_054.add(7);
        numbers_054.add(8);
        numbers_054.add(20);

        printEvenNumbers_054(numbers_054);
    }

    public static void printEvenNumbers_054(List<Integer> numbers_054) {
        System.out.println("Even numbers from the list:");
        for (int num_054: numbers_054) {
            if (num_054 % 2 == 0) {
                System.out.println(num_054);
            }
        }
    }
}

