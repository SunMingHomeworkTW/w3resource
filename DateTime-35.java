import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class DateTime35 {
    public static void main(String[] args) {

        try {
            String originalString = "2016-07-14 09:00:02";
            Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(originalString);
            String newstr = new SimpleDateFormat("yyyy/MM/dd, H:mm:ss").format(date);
            System.out.println(newstr);
        } catch (ParseException e) {
            //Handle exception here
            e.printStackTrace();
        }
    }
}