package fortesting;

public class SwitchJava13 {
    public static void main(String[] args) {
        int i = 21;

        switch(i){
            case 10 -> System.out.println("case 10");
            case 20 -> System.out.println("case 20");
            default -> System.out.println("Unexpected value: " + i);
        }
    }
}
