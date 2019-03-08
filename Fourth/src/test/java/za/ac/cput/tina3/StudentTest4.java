package za.ac.cput.tina3;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class StudentTest4 {
    @Ignore
    @Test
    public void test4(){
        Student s4 = new Student();

        int smark = 89;
        Assert.assertNotSame(smark, s4.marks(9));
    }
}
