package za.ac.cput.tina1;

import org.junit.Assert;

public class StudentTest2 {

    public void test2(){
        Student s2 = new Student();

        int mark = 89;
        Assert.assertNotSame(mark, s2.marks(9));
    }
}
