package test;

/**
 * Created by mengfw on 2017/11/13.
 */
public class TestString {
    public static void main(String[] args) {
        String a = "123";
        String b = new String("123");
        System.out.println(a == b);

        String c = "abc";
        String d = "ab";
        String e = "c";
        System.out.println(c == d+e);
        System.out.println(c == "ab"+"c");

        String f = "abc";
        String g = new String("abc");

        System.out.println(f == g.intern());


    }
}
