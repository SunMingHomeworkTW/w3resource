import java.util.Calendar;

class DateTime4 {
    public static void main(String[] args){
        Calendar calendar=Calendar.getInstance();
        System.out.println("Current Date and Time:"+calendar.getTime());

        int actualMinYear=calendar.getActualMinimum(Calendar.YEAR);
        int actualMinMonth=calendar.getActualMinimum(Calendar.MONTH);
        int actualMinWeek = calendar.getActualMinimum(Calendar.WEEK_OF_YEAR);
        int actualMinDate = calendar.getActualMinimum(Calendar.DATE);

        System.out.println("Actual Maximum Year: "+actualMinYear);
        System.out.println("Actual Maximum Month: "+actualMinMonth);
        System.out.println("Actual Maximum Week of Year: "+actualMinWeek);
        System.out.println("Actual Maximum Date: "+actualMinDate+"\n");
    }
}
