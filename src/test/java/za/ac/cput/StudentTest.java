package za.ac.cput;

import org.junit.*;
import sun.plugin.com.Utils;
import javax.rmi.CORBA.Util;
import javax.rmi.CORBA.UtilDelegate;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class StudentTest {

    Student s;
    @Before
    public void setUp() throws Exception {
        s = new Student.Builder().name("Yolanda").studID("YM201596").course("IT").build();
    }

    @After
    public void tearDown() throws Exception {
    }
    @Ignore

    @Test
    public void testWithTimeout(){
     //final int factirialOf = 1 + (int)(30000 *Math.random());

     //System.out.println("Computing "+factirialOf+" ! = ");
        String studentDetails = "Yolanda, YM201596, IT, Megan";

       // Student stud = new Student();
        Assert.assertEquals(studentDetails, s);
    }

}