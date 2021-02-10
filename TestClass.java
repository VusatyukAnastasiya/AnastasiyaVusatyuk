package exceptions;

public class TestClass implements AutoCloseable {

    public TestClass() {
        throw new RuntimeException("Runtime Exception in TestClass");
    }

    @Override
    public String toString() {
        return "TestClass";
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing...");
    }
}
