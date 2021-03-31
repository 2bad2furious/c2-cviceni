package cz.educanet.praha;

import org.junit.Assert;
import org.junit.Test;

public class SumFromZeroTillTest {
    @Test
    public void test(){
        int result = SumFromZeroTill.sumFromZeroTill(5);
        Assert.assertEquals(1 + 2 + 3 + 4 + 5, result);
    }

    @Test
    public void test2(){
        int result = SumFromZeroTill.sumFromZeroTill(10);
        Assert.assertEquals(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10, result);
    }
}
