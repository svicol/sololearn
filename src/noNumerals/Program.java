package noNumerals;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputString = input.nextLine();

        String[] strings = inputString.split("\\s+");

        StringBuilder result = new StringBuilder();

        for (String word : strings) {
            String text = convertNumeralToString(word);
            result.append(text);
            result.append(" ");
        }
        result.deleteCharAt(result.length() - 1);
        System.out.println(result);
    }

    private static String convertNumeralToString(String word) {
        if (!isNumeral(word)) {
            return word;
        }
        String result;
        switch (word) {
            case "0":
                result = "zero";
                break;
            case "1":
                result = "one";
                break;
            case "2":
                result = "two";
                break;
            case "3":
                result = "three";
                break;
            case "4":
                result = "four";
                break;
            case "5":
                result = "five";
                break;
            case "6":
                result = "six";
                break;
            case "7":
                result = "seven";
                break;
            case "8":
                result = "eight";
                break;
            case "9":
                result = "nine";
                break;
            case "10":
                result = "ten";
                break;
            default:
                result = word;
        }
        return result;
    }

    private static boolean isNumeral(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
