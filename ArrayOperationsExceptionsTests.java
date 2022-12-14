import org.junit.Test;

public class ArrayOperationsExceptionsTests {

    @Test(expected = IllegalArgumentException.class)
    public void averageExceptionTest() {
        ArrayOperations.average(new int[]{});
    }
}
