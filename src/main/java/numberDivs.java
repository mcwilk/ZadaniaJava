import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class numberDivs {
    public static List divs(int number) {
        List<Integer> result = new ArrayList<>();

        for(int i=1; i<=number; i++){
            if(number % i == 0){
                result.add(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int num = 1;
        Scanner scan = new Scanner(System.in);

        while(num > 0){
            System.out.println("Podaj liczbę całkowitą:");
            num = scan.nextInt();

            if(num > 0){
                System.out.println("Dzielnikami liczby " + num + " są: " + divs(num));
            }
        }
    }
}
