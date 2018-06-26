import java.time.YearMonth;
import java.util.*;
class DateTime10 {
    public static void main(String[] args){
        YearMonth ym = YearMonth.of(2018, 6);

        String firstDay = ym.atDay(1).getDayOfWeek().name();
        String lastDay = ym.atEndOfMonth().getDayOfWeek().name();
        System.out.println(firstDay);
        System.out.println(lastDay);
    }
}