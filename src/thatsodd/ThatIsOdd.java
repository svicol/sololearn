package thatsodd;

import java.util.Arrays;
import java.util.Scanner;

public class ThatIsOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Provide the length of the list (N)");
        int length = input.nextInt();
        Integer[] numbers = new Integer[length];
        System.out.println("Enter the desired list of numbers");
        for(int i = 0; i < length; i++){
            numbers[i] = input.nextInt();
        }
        int result = Arrays.stream(numbers).filter(number -> number%2==0).reduce(0, Integer::sum);
        System.out.println(result);
    }
}
