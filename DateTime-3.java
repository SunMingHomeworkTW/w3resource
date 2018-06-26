import java.util.Calendar;

class DateTime3 {
    public static void main(String[] args){
        Calendar calendar=Calendar.getInstance();
        System.out.println("Current Date and Time:"+calendar.getTime());

        int actualMaxYear=calendar.getActualMaximum(Calendar.YEAR);
        int actualMaxMonth=calendar.getActualMaximum(Calendar.MONTH);
        int actualMaxWeek = calendar.getActualMaximum(Calendar.WEEK_OF_YEAR);
        int actualMaxDate = calendar.getActualMaximum(Calendar.DATE);

        System.out.println("Actual Maximum Year: "+actualMaxYear);
        System.out.println("Actual Maximum Month: "+actualMaxMonth);
        System.out.println("Actual Maximum Week of Year: "+actualMaxWeek);
        System.out.println("Actual Maximum Date: "+actualMaxDate+"\n");
    }
}
