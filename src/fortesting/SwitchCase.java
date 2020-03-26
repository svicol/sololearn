package fortesting;

public class SwitchCase {
    public static void main(String[] args) {
        for(int i = 0; i<5; i++){
            switch (i){
                case 0:
                case 2:
                case 4:
                    System.out.print(i+1);
                    break;
            }
        }
    }
}
