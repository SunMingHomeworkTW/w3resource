import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
class DateTime29 {
    public static void main(String[] args){
        String string = "May 1, 2016";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
        LocalDate date = LocalDate.parse(string, formatter);
        System.out.println(date);
    }
}