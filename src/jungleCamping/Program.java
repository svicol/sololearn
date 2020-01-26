package jungleCamping;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        String[] sounds = text.split(" ");

        StringBuilder result = new StringBuilder();

        for(String string:sounds){
            switch (string){
                case "Grr":
                    result.append("Lion ");
                    break;
                case "Rawr":
                    result.append("Tiger ");
                    break;
                case "Ssss":
                    result.append("Snake ");
                    break;
                case "Chirp":
                    result.append("Bird ");
                    break;
                default:
                    break;
            }
        }
        result.deleteCharAt(result.length()-1);
        System.out.println(result);
    }
}
