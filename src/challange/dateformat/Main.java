package challange.dateformat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a dd.MM.YYYY");
        System.out.println(sdf.format(d));
    }

}
