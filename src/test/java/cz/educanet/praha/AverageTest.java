package cz.educanet.praha;

import org.junit.Assert;
import org.junit.Test;

public class AverageTest {

    static double delta = 0.0001;

    @Test
    public void test() {
        double res = Average.average(Utils.createScanner(1, 2, 3, 4, 5, 6, 7, 8));
        Assert.assertEquals(4.5, res, delta);
    }

    @Test
    public void test2() {
        double res = Average.average(Utils.createScanner(2, 4, 6, 8, 10));
        Assert.assertEquals(6.0, res, delta);
    }
}
