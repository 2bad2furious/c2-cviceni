package cz.educanet.praha;

import org.junit.Assert;
import org.junit.Test;

public class SumFromZeroTillTest {
    @Test
    public void test(){
        int result = SumFromZeroTill.sumFromZeroTill(5);
        Assert.assertEquals(15, result);
    }

    @Test
    public void test2(){
        int result = SumFromZeroTill.sumFromZeroTill(10);
        Assert.assertEquals(55, result);
    }
}
