import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
class DateTime9 {
    public static void main(String[] args){
        Calendar calendar=Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

        DateFormat df = new SimpleDateFormat("EEE yyyy/MM/dd");
        System.out.println(df.format(calendar.getTime()));
        calendar.add(Calendar.DATE, 6);
        System.out.println(df.format(calendar.getTime()));
    }
}