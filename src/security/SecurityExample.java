package security;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SecurityExample {
    public static void main(String[] args) {
        Pattern successPattern = Pattern.compile("(((x*)(G*)(x*))*(\\$)((x*)(G+)(x*))+(T)((x*)(G*)(x*))*)|" +
                "(((x*)(G*)(x*))*(T)((x*)(G+)(x*))+(\\$)((x*)(G*)(x*))*)");

        Scanner input = new Scanner(System.in);

        String diagram = input.next();
        Matcher m = successPattern.matcher(diagram);
        if (m.matches()) {
            System.out.println("quiet");
        } else {
            System.out.println("ALARM");
        }
    }
}
