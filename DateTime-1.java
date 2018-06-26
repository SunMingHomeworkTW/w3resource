import java.util.Calendar;

class DateTime1 {
    public static void main(String[] args){
        int year=2018;
        int month=4;
        int date=18;

        Calendar calendar=Calendar.getInstance();
        calendar.clear();
        calendar.set(Calendar.YEAR,year);
        calendar.set(Calendar.MONTH,month);
        calendar.set(Calendar.DATE,date);

        System.out.println(calendar.getTime());
    }
}
