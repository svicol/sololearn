package fortesting;

/**
 * @author sergiu.vicol at 18.03.2020
 */
public class Modulo {
    public static void main(String[] args) {
        System.out.println(9%4.5); //0.0 --> 9/4.5 = 2.0 rest 0.0
        System.out.println(3.0%2); //1.0 --> 3.0/2 = 1.0 rest 1.0
        System.out.println(3.0%2.0); //1.0 --> 3.0/2.0 = 1.0 rest 1.0
        System.out.println(3%2.0); //1.0 --> 3/2.0 = 1.0 rest 1.0
        System.out.println(3%2.5); //0.5 --> 3.0/2.5 = 1.0 rest 0.5

//        System.out.println(0%0); // error java.lang.ArithmeticException: / by zero
//        System.out.println(1%0); //error java.lang.ArithmeticException: / by zero
        System.out.println(1%1); // 0
    }
}
