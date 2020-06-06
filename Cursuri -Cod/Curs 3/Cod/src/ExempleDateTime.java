import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ExempleDateTime {

    public static void main(String[] args) {
        localDate();
        localTime();
        localDateTime();
        zonedDateTime();
        periodAndDuration();
    }


    private static void localDate() {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate localDate2 = LocalDate.of(2019, 11, 1);
        System.out.println(localDate2);

        System.out.println(localDate.isBefore(localDate));
    }

    private static void localTime() {
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalTime localTime2 = LocalTime.of(20, 15);
        System.out.println(localTime2);
    }

    private static void localDateTime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
    }

    private static void zonedDateTime() {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        ZoneId.getAvailableZoneIds()
                .stream()
                .filter(timeZone -> timeZone.contains("Brazil"))
                .forEach(System.out::println);

        ZoneId zoneId = ZoneId.of("Brazil/West");
        ZonedDateTime zonedDateTime2 = ZonedDateTime.now(zoneId);
        System.out.println(zonedDateTime2);
    }

    private static void periodAndDuration() {
        Period p1 = Period.ofDays(3).plusYears(1);
        System.out.println(p1);



        Duration d1 = Duration.ofDays(3)
                .plusMinutes(267)
                .plusSeconds(90);
        System.out.println(d1);
    }
}
