package gothamCity;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfCriminals = input.nextInt();

        if (numberOfCriminals < 5) System.out.println("I got this!");
        else if (numberOfCriminals > 10) System.out.println("Good Luck out there!");
        else System.out.println("Help me Batman");
    }
}
