import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    static String[] choices = {"kamień", "papier", "nożyce"};
    static Random random = new Random();
    static String computerChoice = choices[random.nextInt(choices.length)];

    static Scanner scanner = new Scanner(System.in);

    public static void whoWins(String computer, String user) {
        while (computer.equals(user)) {
            System.out.println("Remis!");
            computer = choices[random.nextInt(choices.length)];
            System.out.println("Wybierz ponownie (kamień, papier, nożyce):");
            user = scanner.nextLine();
        }
        if (computer.equals(choices[0]) && user.equals(choices[1])) {
            System.out.println("Wygrałeś!");
        } else if (computer.equals(choices[0]) && user.equals(choices[2])) {
            System.out.println("Przegrałeś!");
        } else if (computer.equals(choices[1]) && user.equals(choices[2])) {
            System.out.println("Wygrałeś!");
        } else if (computer.equals(choices[1]) && user.equals(choices[0])) {
            System.out.println("Przegrałeś!");
        } else if (computer.equals(choices[2]) && user.equals(choices[0])) {
            System.out.println("Wygrałeś!");
        } else if (computer.equals(choices[2]) && user.equals(choices[1])) {
            System.out.println("Przegrałeś!");
        }
        System.out.println("Komputer wybrał: " + computer);
    }

    public static void main(String[] args) {
        System.out.println("Wybierz (kamień, papier, nożyce):");
        String userChoice = scanner.nextLine();
        whoWins(computerChoice, userChoice);
    }
}
