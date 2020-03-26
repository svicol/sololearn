package fortesting;

/**
 * @author sergiu.vicol at 18.03.2020
 */
public class ArraysDefaultValues {
    public static void main(String[] args) {
        int[] num = new int[5];
        boolean[] boo = new boolean[5];
        for (int i = 0; i < 5; i++) {
            if (boo[i])
                System.out.print(num[i] % 10);
            else
                System.out.print((num[i] + 5) % 10);
        }
    }
}
