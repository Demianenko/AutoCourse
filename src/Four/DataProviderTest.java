package Four;

import org.testng.Assert;
import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;


/**
 * Created by nsokh on 5/31/16.
 */

public class DataProviderTest {

    @DataProvider(name = "Addition", parallel = true)

    public static Object[][] credentials() {

        return new Object[][] { {2, 2 ,4},{3, 2 ,5}, {2, 3 ,5}, {3, 3 ,6}, {3, 4 ,7}, {2, 2 ,4}, {2, 2 ,4}, {2, 2 ,4},
                {2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},
                {2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},
                {2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},
                {2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},{2, 2 ,4},
                {0,0,1}};

    }

    @Test(dataProvider = "Addition" )

    public void test(int a, int b, int c){

        int actualResult = a + b;
        int expectedResult = c;
        Assert.assertEquals(actualResult, expectedResult,"Addition method failed");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}