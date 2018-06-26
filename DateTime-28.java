import java.time.LocalDateTime;
import java.util.*;
class DateTime28 {
    public static void main(String[] args){
        // Before 7 houres and 30 minutes
        LocalDateTime dateTime = LocalDateTime.now().minusHours(7).minusMinutes(30);
        System.out.println("Current Date and Time:  " + LocalDateTime.now());
        System.out.println("Before 7 houres and 30 minutes: " + dateTime);
    }
}