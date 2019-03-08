package za.ac.cput;

import org.junit.*;


public class StudentTest {

    @Ignore
    @Test
    public void student(){

        String studentDetails = "Yolanda, YM201596, IT, Meghan";

        Student s = new Student();
        Assert.assertEquals(studentDetails, s.student("Yolanda, ", "YM201596, ","IT, ","Meghan"));
    }
    @Test(timeout = 60)
    public void testWithTimeout(){
        while(true){
            System.out.printf("Tested timeout");
        }
    }
}