package fortesting;

public class StringsEquality {
    public static void main(String[] args) {
        String a = "text";
        String b = "text";
        System.out.println(a == b);

        String str1 = "text";
        String str2 = "TEXT".toLowerCase();

        System.out.println(str1 == str2);

    }
}
