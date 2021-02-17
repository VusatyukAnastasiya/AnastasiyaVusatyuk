package exceptions;

public class TestClass implements AutoCloseable {

    public TestClass() {
        close();
    }

    public static void main(String[] args) {
        try (TestClass testClass = new TestClass()) {
            System.out.println(testClass.toString());
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    @Override
    public String toString() {
        return "TestClass";
    }

    @Override
    public void close()
    {
        throw new RuntimeException("Runtime Exception in TestClass");
    }
}
