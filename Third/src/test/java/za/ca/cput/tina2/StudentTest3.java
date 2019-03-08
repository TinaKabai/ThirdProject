package za.ca.cput.tina2;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest3 {
    @Test(expected = AssertionError.class)
    public void test3() {
        String studentProfile = "Yolanda, YM201596, IT, Meghan";

        Student s3 = new Student();
        Assert.assertEquals(studentProfile, s3.student("Yolanda, ", "YM201596, ", "IT, ", "Meghan"));
    }
}
