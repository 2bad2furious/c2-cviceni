package cz.educanet.praha;

import org.junit.Assert;
import org.junit.Test;

public class PrintedSquareTest {
    @Test
    public void test() {
        String expected = "*****\n*   *\n*   *\n*   *\n*****";
        String result = PrintedSquare.printSquare(5);
        Assert.assertEquals(expected, result);
    }
    @Test
    public void test2() {
        String expected = "******\n*    *\n*    *\n*    *\n*    *\n******";
        String result = PrintedSquare.printSquare(6);
        Assert.assertEquals(expected, result);
    }
}
