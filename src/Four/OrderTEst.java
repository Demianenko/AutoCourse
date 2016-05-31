package Four;

import org.testng.annotations.Test;


/**
 * Created by nsokh on 5/31/16.
 */
public class OrderTEst {

    @Test(description = "Test to test 1", enabled = true)
    public void test1() {
        System.out.println("Test # 1");
    }

    @Test(description = "Test to test 2" , enabled = true)
    public void test2()  {
        System.out.println("Test # 2");
    }

    @Test(description = "Test to test 3", enabled = true)
    public void test3() {
        System.out.println("Test # 3");
    }

    @Test(description = "Test to test 4", enabled = true)
    public void test4() {
        System.out.println("Test # 4");
    }

    @Test(description = "Test to test 5", enabled = true)
    public void test5(){
        System.out.println("Test # 5");
    }
}
// 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000
