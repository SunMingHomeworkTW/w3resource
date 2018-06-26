import java.text.DateFormatSymbols;
import java.util.*;
class DateTime12 {
    public static void main(String[] args){
//        DateFormatSymbols symbols = new DateFormatSymbols(new Locale("ch"));
        // for the current Locale :
           DateFormatSymbols symbols = new DateFormatSymbols();
        String[] dayNames = symbols.getWeekdays();
        for (String s : dayNames) {
            System.out.println(s );
        }
    }
}