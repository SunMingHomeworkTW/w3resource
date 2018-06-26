import java.time.LocalTime;
import java.util.*;
class DateTime15 {
    public static void main(String[] args){
        LocalTime time = LocalTime.now();
        // adding two hours
        LocalTime newTime = time.plusHours(2);
        System.out.println("Time after 2 hours : " + newTime);
    }
}