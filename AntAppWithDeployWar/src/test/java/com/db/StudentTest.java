package test.java.com.db;

import main.java.com.db.Student;
import org.junit.Assert;
import org.junit.Test;


public class StudentTest {

    @Test
    public void testGetName(){

        Student st1=new Student("teststudent",123);
        String name = st1.getName();
        Assert.assertEquals("teststudent",name);
    }

}
