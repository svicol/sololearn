package fortesting;

import java.util.Scanner;

/**
 * @author sergiu.vicol at 18.03.2020
 */
public class ScannerExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        System.out.println(s);
        System.out.println(d);
        System.out.println(i);
    }
}
