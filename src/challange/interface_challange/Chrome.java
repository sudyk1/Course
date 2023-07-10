package challange.interface_challange;

public class Chrome implements Browser {

    protected String url;
    @Override
    public void gotoPage(String url) {
        this.url = url;
        System.out.println("Chrome url: " + this.url);
    }

    @Override
    public void refreshPage() {
        System.out.println("Page refreshed!");
    }

    @Override
    public void bookmarkPage() {
        System.out.println("Page bookmarked.");
    }
}
