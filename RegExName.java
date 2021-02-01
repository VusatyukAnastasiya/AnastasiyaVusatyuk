import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExName {

        public static void main(String args[]) {
            String name1 = "Ivan Ivanov";
            String name2 = "ivan Ivanov";
            String name3 = "Ivan    Ivanov";
            String name4 = "Ivan I";
            String regexName = "^[A-Z][a-z]{2,}\\s[A-z][a-z]{2,}";
            System.out.println("The name is: " + name1);
            System.out.println("Is the above name valid?   " + name1.matches(regexName));
            System.out.println("The name is: " + name2);
            System.out.println("Is the above name valid?   " + name2.matches(regexName));
            System.out.println("The name is: " + name3);
            System.out.println("Is the above name valid?   " + name3.matches(regexName));
            System.out.println("The name is: " + name4);
            System.out.println("Is the above name valid?   " + name4.matches(regexName));
        }
}


