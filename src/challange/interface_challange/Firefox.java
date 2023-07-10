package challange.interface_challange;

public class Firefox implements Browser {

    protected String url;
    @Override
    public void gotoPage(String url) {
        this.url = url;
        System.out.println("Firefox url: " + this.url);
    }
    @Override
    public void refreshPage() {
        System.out.println("Page refreshed! Firefox!");
    }
    @Override
    public void bookmarkPage() {
        System.out.println("Page bookmakred. Firefox.");
    }
}
