package za.ac.cput.demo;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


public class StudentTest {

    @Ignore
    @Test
    public void student(){

        String studentProfile = "Yolanda, YM201596, IT, Meghan";

        Student s = new Student();
        Assert.assertEquals(studentProfile, s.student("Yolanda, ", "YM201596, ","IT, ","Meghan"));

        int sudentmark = 89;
        Assert.assertNotSame(sudentmark, s.marks(9));
    }
    @Test(timeout = 60)
    public void testWithTimeout(){
        while(true){
            System.out.printf("Tested timeout");
        }
    }
}