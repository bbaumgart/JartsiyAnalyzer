package BasicCarFunctions;

import java.time.LocalDate;

public class TimeStamp {
    public static LocalDate getLocalDateStamp() {
        LocalDate localDate = LocalDate.now();
        return LocalDate.of(localDate.getYear(), localDate.getMonth(), localDate.getDayOfMonth());
    }

}
