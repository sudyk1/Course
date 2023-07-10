package challange.interface_challange;

public class Main {
    public static void main(String[] args) {

        Browser chrome = new Chrome();
        Browser firefox = new Firefox();

        Browser[] browsers = {chrome, firefox};

        System.out.println(Browser.ENGINE);

        for (Browser browser : browsers) {
            browser.gotoPage("google.pl");
            browser.refreshPage();
            browser.bookmarkPage();
        }



    }
}
