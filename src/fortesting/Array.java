package fortesting;

public class Array {
    int a = 2;
    int b = 4;

    public void setData(int a, int b){
        a = a;
        b = b;
    }

    public void showData(){
        System.out.println(a + " " + b);
    }

    public static void main(String[] args) {
        Array obj = new Array();
        obj.setData(2, 3);
        obj.setData(1, 3);
        obj.showData();
    }
}
