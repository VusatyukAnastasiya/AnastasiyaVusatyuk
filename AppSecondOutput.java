package exceptions;

public class AppSecondOutput {

    public static void main(String[] args) {
        System.err.println("#1.in");
        f();
        System.err.println("#1.out");
    }

    public static void f() {
        System.err.println(".   #2.in");
        g();
        System.err.println(".   #2.out");
    }

    public static void g() {
        System.err.println(".   .   #3.in");
        h();
        System.err.println(".   .   #3.out");
    }

    public static void h() {
        System.err.println(".   .   .   #4.in");
        System.err.println(".   .   .   #4.THROW");
        if (true) {
            throw new Error("RUNTIME EXCEPTION");
        }
        System.err.println(".   .   .   #4.out");
    }
}


