package cz.educanet.praha;

import org.junit.Assert;
import org.junit.Test;

public class SumAllNumbersTest {
    @Test
    public void test(){
        int expected = 10;
        int result = SumAllNumbers.calculate(Utils.createScanner(1, 2, 3, 4));
        Assert.assertEquals(expected, result);
    }

    @Test
    public void test2(){
        int expected = 15;
        int result = SumAllNumbers.calculate(Utils.createScanner(1, 2, 3, 4, 5));
        Assert.assertEquals(expected, result);
    }
}
