import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by user on 18.05.2016.
 */
public class Page {

    private static int implicitlyWait = 120;
    private static int sleep = 500;
    private static int timeToWaitAjax = 100000;
    protected static WebDriver wd = new FirefoxDriver();
    private static void waiting(By selector) {
        new WebDriverWait(wd,implicitlyWait).until(ExpectedConditions.elementToBeClickable(selector));
    }
    private static void waitForAjax(int timeoutInSeconds) {
       // System.out.println("Checking active ajax calls by calling jquery.active");
        try {
            if (wd instanceof JavascriptExecutor) {
                JavascriptExecutor jsDriver = (JavascriptExecutor)wd;

                for (int i = 0; i< timeoutInSeconds; i++)
                {
                    Object numberOfAjaxConnections = jsDriver.executeScript("return jQuery.active");
                    // return should be a number
                    if (numberOfAjaxConnections instanceof Long) {
                        Long n = (Long)numberOfAjaxConnections;
                        System.out.println("Number of active jquery ajax calls: " + n);
                        if (n.longValue() == 0L)
                            break;
                    }
                   // Thread.sleep(sleep);
                }
            }
            else {
                System.out.println("Web driver: " + wd + " cannot execute javascript");
            }
        }
        catch (WebDriverException e) {
           // e.printStackTrace();
        }
    }
    protected static void fillForm( String selector, String info) {
        waiting(By.xpath(selector) );
        WebElement el = wd.findElement(By.xpath(selector));
        el.click();
        waitForAjax(timeToWaitAjax);
        el.sendKeys(info);

    }
    protected static void fillClearForm( String selector, String info) {
        waiting(By.xpath(selector) );
        WebElement el = wd.findElement(By.xpath(selector));
        el.click();
        waitForAjax(timeToWaitAjax);
        el.clear();
        el.sendKeys(info);

    }
    protected static void selectFromDropdownByText(String selector, String choose) {
        new Select(wd.findElement(By.xpath(selector))).selectByVisibleText(choose);

    }
    protected static void clickButton(String selector) {
        WebElement el = null;
        waiting(By.xpath(selector));
        el = wd.findElement((By.xpath(selector)));
        waitForAjax(timeToWaitAjax);
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        el.click();
    }
    protected static void connect(String url) {
        wd.get(url);
    }

}
