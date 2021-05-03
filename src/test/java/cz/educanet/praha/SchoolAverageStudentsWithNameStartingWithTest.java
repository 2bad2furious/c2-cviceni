package cz.educanet.praha;

import cz.educanet.praha.school.School;
import org.junit.Assert;
import org.junit.Test;

public class SchoolAverageStudentsWithNameStartingWithTest {
    @Test
    public void test() {
        School s = SchoolCountStudentsFromClassByNameTest.s;
        Assert.assertEquals(7, SchoolAverageStudentsWithNameStartingWith.averageAgeOfStudentsWithNameStartingWith(s, 'K'), 0.00001);
        Assert.assertEquals(8, SchoolAverageStudentsWithNameStartingWith.averageAgeOfStudentsWithNameStartingWith(s, 'J'), 0.00001);
    }
}
