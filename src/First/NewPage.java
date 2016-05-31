package First;

public class NewPage {
    private String url;
    Integer numberOf;
    String title;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getNumberOf() {
        return numberOf;
    }

    public String getTitle() {
        return title;
    }

    public NewPage(String url, String title, int numberOf) {
        this.url = url;
        this.title = title;
        this.numberOf = numberOf;
    }

    public NewPage() {
    }

    public void setNumberOf(int numberOf) {
        this.numberOf = numberOf;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
