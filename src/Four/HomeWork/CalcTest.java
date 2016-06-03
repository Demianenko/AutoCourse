package Four.HomeWork;

import Third.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcTest {

    Calculator calculator = new Calculator();

    @Test(dataProvider = "getDataPlus",dataProviderClass = CalcTestData.class, description = "Test +", enabled = true, groups = {"smoke","p1"})
    public void testPlus(double a, double b, double c){
        Assert.assertEquals(calculator.calc(a,b,"+"),c);
    }
    @Test(dataProvider = "getDataMinus", dataProviderClass = CalcTestData.class,description = "Test -", enabled = true, groups = "p1")
    public void testMinus(double a, double b, double c) {
        Assert.assertEquals(calculator.calc(a, b, "-"), c);
    }
    @Test(dataProvider = "getDataMulti",dataProviderClass = CalcTestData.class, description = "Test *", enabled = true, groups = "p2")
    public void testMulti(double a, double b, double c){
        Assert.assertEquals(calculator.calc(a,b,"*"),c);
    }
    @Test(dataProvider = "getDataDev", dataProviderClass = CalcTestData.class, description = "Test /", enabled = true, groups = "p3")
    public void testDev(double a, double b, double c){
        Assert.assertEquals(calculator.calc(a,b,"/"),c);
    }
}
