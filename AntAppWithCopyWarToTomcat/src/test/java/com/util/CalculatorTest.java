package test.java.com.util;

import main.java.com.util.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAdd(){
        Calculator calc=new Calculator();
        int sum=calc.add(1,2);
        Assert.assertEquals(3,sum);
    }

}
