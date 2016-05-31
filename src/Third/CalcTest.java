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

    }
}
