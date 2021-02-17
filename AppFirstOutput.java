package exceptions;

public class AppFirstOutput {

    public static void main(String[] args) {
        System.err.println("#1.in");
        try {
            f();
        } catch (RuntimeException e) {
            System.err.println("#1.CATCH");
        }
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
        if(true) {
            throw new RuntimeException();
        }
        System.err.println(".   .   .   #4.out");
    }
}

