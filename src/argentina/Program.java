package argentina;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int priceInPesos = input.nextInt();
        int priceInDollars = input.nextInt();

        double costInDollars = priceInPesos * 0.02d;
        if (costInDollars < priceInDollars)
            System.out.println("Pesos");
        else
            System.out.println("Dollars");
    }
}