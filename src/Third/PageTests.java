package Third;
import First.NewPage;
import org.testng.annotations.*;
import org.testng.Assert;
/**
 * Created by sega on 24.05.16.
 */
public class PageTests {
    NewPage mainPage = new NewPage();
    NewPage mainPageTest = new NewPage();
    @BeforeMethod
    public void precondition(){
        System.out.println("Preconditions");
        mainPage.setUrl("http://mainpage.com");
        mainPage.setNumberOf(1);
        mainPage.setTitle("Main");

        mainPageTest.setUrl("http://mainpage.com");
        mainPageTest.setNumberOf(1);
        mainPageTest.setTitle("Main");
    }
    @Test(description = "Test title", enabled = true)
    public void testPageTitle(){
        Assert.assertEquals(mainPage.getTitle(),"Main");
    }
    @Test(description = "Test url", enabled = true)
    public void testPageUrl(){
        Assert.assertEquals(mainPage.getUrl(),"http://mainpage.com");
    }
    @Test
    public void TestObjects(){
        Assert.assertEquals(mainPage,mainPageTest);
    }
}
