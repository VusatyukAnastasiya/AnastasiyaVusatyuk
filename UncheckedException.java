package exceptions;

import java.util.Arrays;
import java.util.List;

public class UncheckedException extends RuntimeException {

    public UncheckedException(String message) {
        super(message);
    }

    public static void main(String[] args) {
        validateEmail("abc@gmail1.com");
    }

    private static void validateEmail(String email) {
        if (!isDomainValid(email)) throw new UncheckedException("Invalid domain");
    }

    private static boolean isDomainValid(String email) {
        List<String> validDomains = Arrays.asList("gmail.com", "yahoo.com", "outlook.com");
        if (validDomains.contains(email.substring(email.indexOf("@") + 1))) {
            return true;
        }
        return false;
    }

}
