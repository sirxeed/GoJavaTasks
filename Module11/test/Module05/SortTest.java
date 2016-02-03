package Module05;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SortTest {

    private int[] array = new int[4];

    @Before
    public void setUp() throws Exception {
        array[0] = 9;
        array[1] = 4;
        array[2] = 1;
        array[3] = 6;
    }

    @Test(timeout = 1000)
    public void testBubbleOptimized() throws Exception {
        Sort.bubbleOptimized(array);
        Assert.assertEquals(1, array[0]);
        Assert.assertEquals(9, array[3]);
    }

    @Test(timeout = 1000)
    public void testCocktail() throws Exception {
        Sort.cocktail(array);
        Assert.assertEquals(1, array[0]);
        Assert.assertEquals(9, array[3]);
    }

    @Test
    public void testMinimum() throws Exception {
        Assert.assertEquals(1, Sort.minimum(array));
    }

    @Test
    public void testMaximum() throws Exception {
        Assert.assertEquals(9, Sort.maximum(array));
    }
}