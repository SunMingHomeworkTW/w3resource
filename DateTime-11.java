import java.util.*;
class DateTime11 {
    public static void main(String[] args){
        Calendar calendar=Calendar.getInstance();
        int days = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("Number of days of the current month : " + days);
    }
}