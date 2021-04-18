package cz.educanet.praha;

import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

public class CinemaReservationsTest {

    @Test
    public void test(){
        Scanner sc = Utils.createScanner(0, "Honza", 1, "Marek", 2, "Mirek");
        String[] namesOnSeat = new String[]{null, null, null, "2bad2furious", null, null};
        Assert.assertEquals(2, Cinema.freeSpaces(namesOnSeat, sc));
    }

    @Test
    public void testTaken() {
        Scanner sc = Utils.createScanner(0, "Honza", 0, 1, "Kacka", 2, "Martin", 3, 4, "Marek", 5, "Michal");
        String[] namesOnSeat = new String[]{null, null, null, "2bad2furious", null, null, null, "monarezio"};
        Assert.assertEquals(1, Cinema.freeSpaces(namesOnSeat, sc));
    }

    @Test
    public void testOutOfBounds(){
        Scanner sc = Utils.createScanner(-1, 9, 0, "Honza");
        String[] namesOnSeat = new String[]{null};
        Assert.assertEquals(0, Cinema.freeSpaces(namesOnSeat, sc));
    }
}
