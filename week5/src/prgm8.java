import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class prgm8 {
    public static void main(String[] args) {
        Scanner scanner_054 = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input_054 = scanner_054.nextLine();
        Map<Character, Integer> charCount_054 = countCharacters_054(input_054);
        System.out.println("Character counts:");
        for (Map.Entry<Character, Integer> entry_054 : charCount_054.entrySet()) {
            System.out.println("'" + entry_054.getKey() + "': " + entry_054.getValue());
        }
        scanner_054.close();
    }
    public static Map<Character, Integer> countCharacters_054(String text_054) {
        Map<Character, Integer> charCountMap_054 = new HashMap<>();
        for (char c_054 : text_054.toCharArray()) {
            if (charCountMap_054.containsKey(c_054)) {
                charCountMap_054.put(c_054, charCountMap_054.get(c_054) + 1);
            } else {
                charCountMap_054.put(c_054, 1);
            }
        }
        return charCountMap_054;
    }
}

