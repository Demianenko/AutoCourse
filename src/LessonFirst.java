import org.openqa.selenium.Keys;

/**
 * Created by user on 18.05.2016.
 */
public class LessonFirst extends Page {
    public static void main(String[] args) {
        String url = "http://google.com";
        String searchSelector = "//*[@id=\"lst-ib\"]";
        String searchQuery = "Hello      World";

        connect(url);
        fillForm(searchSelector,searchQuery);
        fillForm(searchSelector, String.valueOf(Keys.ENTER));

        System.out.println("Hello World");
    }
}
