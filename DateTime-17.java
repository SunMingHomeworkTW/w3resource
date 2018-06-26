import java.util.*;
class DateTime17 {
    public static void main(String[] args){
        Calendar calendar=Calendar.getInstance();
        Date cdate = calendar.getTime();
        // get next year
        calendar.add(Calendar.YEAR, 1);
        Date nyear = calendar.getTime();
        //get previous year
        calendar.add(Calendar.YEAR, -2);
        Date pyear = calendar.getTime();
        System.out.println("Current Date : " + cdate);
        System.out.println("Date before 1 year : " + pyear);
        System.out.println("Date after 1 year  : " + nyear);
    }
}