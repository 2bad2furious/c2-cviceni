package cz.educanet.praha;

import org.junit.Assert;
import org.junit.Test;

public class SumSumsOfEvenAndMultipleOfOddTest {

    @Test
    public void test() {
        int result = SumSumsOfEvenAndMultipleOfOdd.sumSumsOfEvenAndMultipleOfOdd(Utils.createScanner(1, 2, 3, 4, 5));
        //noinspection PointlessArithmeticExpression
        Assert.assertEquals((2 + 4) + (1 * 3 * 5), result);
    }

    @Test
    public void test2() {
        int result = SumSumsOfEvenAndMultipleOfOdd.sumSumsOfEvenAndMultipleOfOdd(Utils.createScanner(1, 2, 3, 4, 5, 6, 7, 8, 9));
        //noinspection PointlessArithmeticExpression
        Assert.assertEquals((2 + 4 + 6 + 8) + (1 * 3 * 5 * 7 * 9), result);
    }
}
