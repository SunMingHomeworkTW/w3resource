import java.time.LocalDate;
import java.time.Period;
import java.util.*;
class DateTime30 {
    public static void main(String[] args){
        LocalDate pdate = LocalDate.of(2012, 01, 01);
        LocalDate now = LocalDate.now();

        Period diff = Period.between(pdate, now);

        System.out.printf("Difference is %d years, %d months and %d days.\n",
                diff.getYears(), diff.getMonths(), diff.getDays());
    }
}