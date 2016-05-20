import site.NewPage;

public class LessonFirst extends Page {
    private  static String str = "Hello World";
    public static void main(String[] args) {
        NewPage mainPage = new NewPage();
        mainPage.setUrl("http:google.com");
        mainPage.setNumberOf(mainPage.getUrl().length());
        System.out.println(str);
        System.err.println(mainPage.getNumberOf());
    }
}
