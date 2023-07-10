package challange.interface_challange;

public interface Browser {

    static final String ENGINE = "WebKit";

    default String getEngine() {
        return Browser.ENGINE;
    }

    void gotoPage(String url);

    void refreshPage();

    void bookmarkPage();

}
