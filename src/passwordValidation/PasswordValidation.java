package passwordValidation;

import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
        String symbols = "!@#$%&*";
        Scanner input = new Scanner(System.in);

        String password = input.next();

        if(password.length()<7){
            System.out.println("Weak");

            return;
        }

        int numbersCount =0;
        int symbolsCount = 0;
        for(int i=0; i<password.length(); i++){
            if (Character.isDigit(password.charAt(i))) numbersCount++;
            if(symbols.indexOf(password.charAt(i))>=0) symbolsCount++;
        }

        if((numbersCount >= 2) && (symbolsCount >= 2)){
            System.out.println("Strong");
        } else {
            System.out.println("Weak");
        }
    }
}
