package fortesting;

/**
 * @author sergiu.vicol at 18.03.2020
 */
class A {
    int i;
}

class B extends A{
    int i;
}

public class HiddenFields {

    static void fooA(A a){
        a.i = 3;
    }
    static void fooB(B b){
        if(b.i == 3)
            b.i = 5;
    }

    public static void main(String[] args) {
        B obj = new B();
        fooA(obj);
        System.out.println(obj.i);
        fooB(obj);
        System.out.println(obj.i);
    }

}
