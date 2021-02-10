package exceptions;

import java.io.*;

public class ExceptionLesson {
    public static void main(String[] args) {
        //#1
        checkedException();
        //#3
        tryWithResource();
        //#2
        uncheckedException();
    }

    public static void checkedException() {
        File file = new File("not_existing_file.txt");
        try {
            FileInputStream stream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }

    public static void uncheckedException() {
        int[] arr = {1,2,3,4,5};
        System.out.println(arr[7]);
    }

    public static void tryWithResource() {
        try(TestClass testClass = new TestClass()) {
            testClass.toString();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}




