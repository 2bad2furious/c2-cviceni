package cz.educanet.praha;

import org.junit.Assert;
import org.junit.Test;

public class MostAverageNumberTest {
    @Test
    public void testSimple() {
        int result = MostAverageNumber.findMostAverageNumber(Utils.createScanner(5, 1, 2, 3, 4, 5));
        Assert.assertEquals(3, result);
    }

    @Test
    public void testComplicated() {
        int result = MostAverageNumber.findMostAverageNumber(Utils.createScanner(6, 2, 3, 4, 7, 7, 8));
        Assert.assertEquals(4, result);
    }
}
