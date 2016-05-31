package Third;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcTest {
    double one = 1;
    double minusOne = -1;
    double zerro = 0;
    Calculator calculator = new Calculator();
    @Test(description = "Test +", enabled = true)
    public void testPlus(){
        Assert.assertEquals(calculator.calc(zerro,zerro,"+"),zerro);
        Assert.assertEquals(calculator.calc(minusOne,minusOne,"+"),-2.0);
        Assert.assertEquals(calculator.calc(minusOne,one,"+"),zerro);
        Assert.assertEquals(calculator.calc(Double.MAX_VALUE,Double.MAX_VALUE,"+"),Double.POSITIVE_INFINITY);
    }
    @Test(description = "Test -", enabled = true)
    public void testMinus(){
        Assert.assertEquals(calculator.calc(zerro,zerro,"-"),zerro);
        Assert.assertEquals(calculator.calc(minusOne,minusOne,"-"),zerro);
        Assert.assertEquals(calculator.calc(minusOne,one,"-"),-2.0);
        Assert.assertEquals(calculator.calc(Double.MIN_VALUE,-Double.MIN_VALUE,"-"),Double.NEGATIVE_INFINITY);
    }
    @Test(description = "Test *", enabled = true)
    public void testMulti(){
        Assert.assertEquals(calculator.calc(zerro,zerro,"*"),zerro);
        Assert.assertEquals(calculator.calc(minusOne,minusOne,"*"),one);
        Assert.assertEquals(calculator.calc(minusOne,one,"*"),minusOne);
        Assert.assertEquals(calculator.calc(Double.MIN_VALUE,zerro,"*"),zerro);
        Assert.assertEquals(calculator.calc(Double.MAX_VALUE,Double.MAX_VALUE,"*"),Double.POSITIVE_INFINITY);
    }
    @Test(description = "Test /", enabled = true)
    public void testDev(){
        Assert.assertEquals(calculator.calc(zerro,zerro,"/"),Double.NaN);
        Assert.assertEquals(calculator.calc(minusOne,minusOne,"/"),one);
        Assert.assertEquals(calculator.calc(minusOne,one,"/"),minusOne);
        Assert.assertEquals(calculator.calc(Double.MIN_VALUE,zerro,"/"),Double.POSITIVE_INFINITY);
        Assert.assertEquals(calculator.calc(Double.MAX_VALUE,Double.MAX_VALUE,"/"),one);

    }
}
