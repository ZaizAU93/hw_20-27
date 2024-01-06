package hw_23;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time {
    public static String getDate() {
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(("yy/MM/dd|HH:mm"));
        return date.format(formatter);
    }
}
