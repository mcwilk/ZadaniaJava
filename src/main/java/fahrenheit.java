/*
# Python code:

def main():
    fahr = int(input("Enter the temperature in F: "))
    cel = (fahr - 32) * 5.0/9.0
    print("the temperature in C is: ", cel)

*/

import java.util.Scanner;

public class fahrenheit {
    public static void main(String[] args) {
        double fahr;
        double cel;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter the temperature in F: ");
        fahr = input.nextDouble();

        cel = (fahr - 32) * 5.0/9.0;
        System.out.println("The temperature in C is: " + cel);
    }
}
