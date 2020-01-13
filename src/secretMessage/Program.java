package secretMessage;


import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String inputMessage = input.nextLine().toLowerCase();
        StringBuilder resultMessage = new StringBuilder();;
        String codesReversed = "";

        for (int i = 0; i < inputMessage.length(); i++) {
            if(inputMessage.charAt(i)==' '){
                resultMessage.append(inputMessage.charAt(i));
            } else{
                int charCode = (int) inputMessage.charAt(i);
                int aCode = (int) 'a';
                int zCode = (int) 'z';
                int reversedCode = zCode - (charCode-aCode);
                resultMessage.append((char) reversedCode);
            }
        }
        System.out.println(resultMessage);
    }
}
