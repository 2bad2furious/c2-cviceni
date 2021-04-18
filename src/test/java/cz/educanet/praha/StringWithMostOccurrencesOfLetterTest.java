package cz.educanet.praha;

import org.junit.Assert;
import org.junit.Test;

public class StringWithMostOccurrencesOfLetterTest {
    @Test
    public void testA() {
        String result = StringWithMostOccurrencesOfLetter.findStringWithMostOccurrencesOfLetter(
                new String[]{"crash", "alphabet", "bus", "ship", "car"}, 'a'
        );
        Assert.assertEquals("alphabet", result);
    }

    @Test
    public void testB() {
        String result = StringWithMostOccurrencesOfLetter.findStringWithMostOccurrencesOfLetter(
                new String[]{"banana", "beach", "bamboo", "loop", "space", "ban"}, 'b'
        );
        Assert.assertEquals("bamboo", result);
    }
}
