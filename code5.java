import java.util.Scanner;

public class code5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        int letterCount = name.replaceAll("[^a-zA-Z]", "").length();
        System.out.println("Number of letters in your name: " + letterCount);
        String encrypted = encrypt(name, 3);
        System.out.println("Encrypted name: " + encrypted);
        scanner.close();
    }

    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                c = (char) ((c - base + shift) % 26 + base);
            }
            result.append(c);
        }
        return result.toString();
    }
}
