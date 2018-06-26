import java.util.Calendar;
import java.util.TimeZone;

class DateTime5 {
    public static void main(String[] args){
        Calendar newyorkCal=Calendar.getInstance();
        newyorkCal.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        System.out.println("Time in New York: "+newyorkCal.get(Calendar.HOUR_OF_DAY)+":"+newyorkCal.get(Calendar.MINUTE)+":"+newyorkCal.get(Calendar.SECOND));
    }
}
