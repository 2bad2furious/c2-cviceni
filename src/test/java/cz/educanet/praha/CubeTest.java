package cz.educanet.praha;

import org.junit.Assert;
import org.junit.Test;

public class CubeTest {
    @Test
    public void test() {
        int res = Cube.sumOfAreasAndVolumes(Utils.createScanner(5));
        Assert.assertEquals(
                (6 * 5 * 5) + (5 * 5 * 5),
                res);
    }

    @Test
    public void test2() {
        int res = Cube.sumOfAreasAndVolumes(Utils.createScanner(10, 20, 30));
        Assert.assertEquals(
                ((6 * 10 * 10) + (10 * 10 * 10)) + ((6 * 20 * 20) + (20 * 20 * 20)) + ((6 * 30 * 30) + (30 * 30 * 30)),
                res);
    }
}
