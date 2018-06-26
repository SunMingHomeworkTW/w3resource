import java.time.LocalDate;
import java.time.Period;
import java.util.*;
class DateTime32 {
    public static void main(String[] args){
        // date of birth
        LocalDate pdate = LocalDate.of(1993, 9, 25);
        // current date
        LocalDate now = LocalDate.now();
        // difference between current date and date of birth
        Period diff = Period.between(pdate, now);

        System.out.printf("I am  %d years, %d months and %d days old.\n",
                diff.getYears(), diff.getMonths(), diff.getDays());
    }
}