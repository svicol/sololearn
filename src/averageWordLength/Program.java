package averageWordLength;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputString = input.nextLine();

        String[] words = inputString.replaceAll("[^a-zA-Z ]", "").split("\\s+");

        int charCount = 0;
        for (String word : words) charCount += word.length();

        double preciseResult = (double) charCount / (double) words.length;
        int result = (int) Math.ceil(preciseResult);

        System.out.println(result);
    }
}