package interviewTest.test;

import java.time.LocalDateTime;
import java.util.Date;

public class JavaTimeEx {
    public static void main(String[] args) {
        Date date=new Date();
        System.out.println(date);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        LocalDateTime localDateTime = LocalDateTime.now().minusDays(1);

        System.out.println(localDateTime);

    }
}
