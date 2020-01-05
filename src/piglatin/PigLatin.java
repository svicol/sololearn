package piglatin;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PigLatin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        List<String> strings = Arrays.asList(text.split(" "));

        StringBuilder result = new StringBuilder();

        for(String string:strings){
            char begining = string.charAt(0);
            result.append(string.substring(1, string.length()));
            result.append(begining);
            result.append("ay ");
        }
        result.deleteCharAt(result.length()-1);
        System.out.println(result);
    }
}
