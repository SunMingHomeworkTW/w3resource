import java.time.LocalTime;
import java.util.*;
class DateTime27 {
    public static void main(String[] args){
        LocalTime time = LocalTime.of(12, 24, 32);
        int hour = time.getHour();
        int minute = time.getMinute();
        int second = time.getSecond();
        System.out.println("Current Local time: " + time);
        System.out.println("Hour: " + hour);
        System.out.println("Minue: " + minute);
        System.out.println("Second: " +second);
    }
}