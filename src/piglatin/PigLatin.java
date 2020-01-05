package piglatin;


import java.util.Scanner;

public class PigLatin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        String[] strings = text.split(" ");

        StringBuilder result = new StringBuilder();

        for(String string:strings){
            char begining = string.charAt(0);
            result.append(string.substring(1));
            result.append(begining);
            result.append("ay ");
        }
        result.deleteCharAt(result.length()-1);
        System.out.println(result);
    }
}
