package za.ac.cput;

import org.junit.*;
import sun.plugin.com.Utils;
import javax.rmi.CORBA.Util;
import javax.rmi.CORBA.UtilDelegate;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class StudentTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Ignore
    @Test(timeout = 1000)
    public void testWithTimeout(){
     final int factirialOf = 1 + (int)(30000 *Math.random());

     System.out.println("Computing "+factirialOf+" ! = ");
        String studentDetails = "Yolanda, YM1996, IT, Megan";

        Student stud = new Student();

        Assert.assertEquals(studentDetails, stud.names("Yolanda, ","YM1996, ", "IT, ", "Megan"));
    }
}