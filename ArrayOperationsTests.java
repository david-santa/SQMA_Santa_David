import org.junit.*;

public class ArrayOperationsTests {

    int[] arr = new int[]{1, 2, 3, 4, 5, 6};


    @Test
    public void sumTest() {
        Assert.assertEquals(21, ArrayOperations.sum(arr));
    }

    @Test
    public void maxTest() {
        Assert.assertEquals(6, ArrayOperations.max(arr));
    }

    @Test
    public void minTest() {
        Assert.assertEquals(1, ArrayOperations.min(arr));
    }

    @Test
    public void averageNormalTest() {
        Assert.assertEquals(3.5, ArrayOperations.average(arr), 0.01);
    }

}
