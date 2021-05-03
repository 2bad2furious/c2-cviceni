package cz.educanet.praha;

import org.junit.Assert;
import org.junit.Test;

public class SchoolCountAllStudentsTest {

    @Test
    public void test1(){
        Assert.assertEquals(5, SchoolCountAllStudents.countAllStudents(SchoolCountStudentsFromClassByNameTest.s));
    }
}
