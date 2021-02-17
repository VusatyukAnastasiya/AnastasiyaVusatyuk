package exceptions;

public class CheckedException extends Exception {

    public CheckedException(String message) {
        super(message);
    }

    public static void main(String[] args) {
        int a = 1;
        try {
            if (a == 1)
                throw new CheckedException("test1");
        } catch (CheckedException exception) {
            System.out.println("Checked expression example");
        }
    }
}









