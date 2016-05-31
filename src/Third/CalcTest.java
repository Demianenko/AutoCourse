package Third;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by user on 31.05.2016.
 */
public class CalcTest {
    Calculator calculator = new Calculator();
    @Test(description = "Test +", enabled = true)
    public void testPlus(){
        Assert.assertEquals(calculator.calc(0,0,"+"),0.0);
        Assert.assertEquals(calculator.calc(-1,-1,"+"),-2.0);
        Assert.assertEquals(calculator.calc(-1,1,"+"),0.0);
        Assert.assertEquals(calculator.calc(Double.MAX_VALUE,Double.MAX_VALUE,"+"),Double.POSITIVE_INFINITY);
    }
    @Test(description = "Test -", enabled = true)
    public void testMinus(){
        Assert.assertEquals(calculator.calc(0,0,"-"),0.0);
        Assert.assertEquals(calculator.calc(-1,-1,"-"),0.0);
        Assert.assertEquals(calculator.calc(-1,1,"-"),-2.0);
        Assert.assertEquals(calculator.calc(Double.MIN_VALUE,-Double.MIN_VALUE,"-"),Double.NEGATIVE_INFINITY);
    }
    @Test(description = "Test *", enabled = true)
    public void testMulti(){
        Assert.assertEquals(calculator.calc(0,0,"*"),0.0);
        Assert.assertEquals(calculator.calc(-1,-1,"*"),1.0);
        Assert.assertEquals(calculator.calc(-1,1,"*"),-1.0);
        Assert.assertEquals(calculator.calc(Double.MIN_VALUE,0,"*"),0.0);
        Assert.assertEquals(calculator.calc(Double.MAX_VALUE,Double.MAX_VALUE,"*"),Double.POSITIVE_INFINITY);
    }
    @Test(description = "Test /", enabled = true)
    public void testDev(){
        Assert.assertEquals(calculator.calc(0,0,"/"),Double.NaN);
        Assert.assertEquals(calculator.calc(-1,-1,"/"),1.0);
        Assert.assertEquals(calculator.calc(-1,1,"/"),-1.0);
        Assert.assertEquals(calculator.calc(Double.MIN_VALUE,0,"/"),Double.POSITIVE_INFINITY);
        Assert.assertEquals(calculator.calc(Double.MAX_VALUE,Double.MAX_VALUE,"/"),1.0);

    }
}
