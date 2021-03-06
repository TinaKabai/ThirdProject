package za.ac.cput;

import org.junit.*;


public class StudentTest {

    @Ignore
    @Test
    public void student(){

        String studentProfile = "Yolanda, YM201596, IT, Meghan";

        Student s = new Student();
        Assert.assertEquals(studentProfile, s.student("Yolanda, ", "YM201596, ","IT, ","Meghan"));

        int smark = 89;
        Assert.assertNotSame(smark, s.marks(9));
    }
    @Test(expected = AssertionError.class)
    public void disableTest(){
        String studentProfile = "Yolanda, YM201596, IT, Meghan";

        Student s = new Student();
        Assert.assertEquals(studentProfile, s.student("Yolanda, ", "YM201596, ","IT, ","Meghan"));
    }

    @Test(timeout = 60)
    public void testWithTimeout(){
        while(true){
            System.out.printf("Tested timeout");
        }
    }
}