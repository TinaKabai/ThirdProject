package za.ac.cput.demo;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest1 {
    @Test
    public void test1(){
        Student s1 = new Student();
        String studentProfile = "Yolanda, YM201596, IT, Meghan";

        Assert.assertEquals(studentProfile, s1.student("Yolanda, ", "YM201596, ","IT, ","Meghan"));

    }
}
