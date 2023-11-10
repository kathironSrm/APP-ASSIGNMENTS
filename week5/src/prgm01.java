import java.util.Scanner;

public class prgm01 {
    public static void main(String[] args) {
        Scanner scanner_054 = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input_054 = scanner_054.nextLine();

        String mirrorImage_054 = getMirrorImage_054(input_054);
        System.out.println("Mirror Image: " + mirrorImage_054);

        scanner_054.close();
    }

    public static String getMirrorImage_054(String str_054) {
        StringBuilder mirror_028 = new StringBuilder();

        for (int i_028 = str_054.length() - 1; i_028 >= 0; i_028--) {
            mirror_028.append(str_054.charAt(i_028));
        }

        return mirror_028.toString();
    }
}

