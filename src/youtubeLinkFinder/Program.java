package youtubeLinkFinder;


import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String inputLink = input.next();
        String[] strings = inputLink.split("/");

        String result = strings[strings.length-1];
        String lastWord = new String();

        if(result.contains("=")) {
            String[] words = result.split("=");
            lastWord = words[words.length-1];
        } else lastWord = result;

        System.out.println(lastWord);
    }
}
