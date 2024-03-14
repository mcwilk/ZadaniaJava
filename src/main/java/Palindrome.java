import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wordToBeChecked = "";

        do {
            System.out.println("Podaj słowo:");
            wordToBeChecked = scanner.nextLine();
            String wordReversed = "";

            for (int i = 0; i < wordToBeChecked.length(); i++) {
                wordReversed += wordToBeChecked.charAt(wordToBeChecked.length() - i - 1);
            }

            if (wordToBeChecked.equals(wordReversed)) {
                System.out.println("Słowo " + wordToBeChecked + " jest palindromem!");
            } else {
                System.out.println("Słowo " + wordToBeChecked + " NIE JEST palindromem!");
            }
        } while (!wordToBeChecked.isEmpty());
    }
}
