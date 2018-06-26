import java.util.*;
class DateTime16 {
    public static void main(String[] args){
        Calendar calendar = Calendar.getInstance();
        Date cdate = calendar.getTime();
//        calendar.add(Calendar.DAY_OF_YEAR, noOfDays);
        calendar.add(Calendar.WEEK_OF_YEAR, 2);
        Date date = calendar.getTime();
        System.out.println("Current Date: " + cdate);
        System.out.println("Day after two weeks: " + date);

    }
}