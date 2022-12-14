import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class ArrayOperationsTests {

    int[] arr = new int[]{1, 2, 3, 4, 5, 6};


    @Test
    public void sumTest() {
        assertEquals(21, ArrayOperations.sum(arr));
    }

    @Test
    public void maxTest() {
        assertEquals(6, ArrayOperations.max(arr));
    }

    @Test
    public void minTest() {
        assertEquals(1, ArrayOperations.min(arr));
    }

    @Test
    public void averageNormalTest() {
        assertEquals(3.5, ArrayOperations.average(arr), 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void averageExceptionTest() {
        ArrayOperations.average(new int[]{});
    }
}
