package cz.educanet.praha;

import cz.educanet.praha.school.Class;
import cz.educanet.praha.school.School;
import cz.educanet.praha.school.Student;
import org.junit.Assert;
import org.junit.Test;

public class SchoolCountStudentsFromClassByNameTest {

    static School s = new School(new Class[]{
            new Class("C1", new Student[]{
                    new Student("Jan", 10), new Student("Kryštof", 3)
            }),
            new Class("C2", new Student[]{
                    new Student("Martin", 9), new Student("Jiří", 6), new Student("Kamila", 11)
            })
    });

    @Test
    public void testFound() {
        Assert.assertEquals(3, SchoolCountStudentsFromClassByName.countStudentsFromClassByItsName(s, "C2"));
        Assert.assertEquals(2, SchoolCountStudentsFromClassByName.countStudentsFromClassByItsName(s, "C1"));
    }

    @Test
    public void testNotFound(){
        Assert.assertEquals(0, SchoolCountStudentsFromClassByName.countStudentsFromClassByItsName(s, "C3"));
    }
}
