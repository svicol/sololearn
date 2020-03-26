package fortesting;

/**
 * @author sergiu.vicol at 09.03.2020
 */
public class DivisionOfInt {
    public static void main(String[] args) {
        int i = 3, j = 6;

        while(i != j){
            if(i==j){
                System.out.println(0/(i-j));
                break;
            }
            i += 3;
            j += 2;
        }
        System.out.println(i/j);

        int x = 6, y = 7;
        System.out.println(x/y);

        int w = 2;

        System.out.println(5/w);

        int z = 4;
        do{
            switch (z){
                case 4:
                case 5:
                    break;
                default:
                    System.out.print(z);
            }
        } while (++z < 8);

        int ii = 01234567;
        System.out.println(ii);
    }
}
