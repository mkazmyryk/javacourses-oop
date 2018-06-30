package JavaOOPHWLesson7.Max;

import java.time.LocalDate;
import java.util.Comparator;

public class DayInYearComparator implements Comparator<LocalDate> {
    @Override
    public int compare(LocalDate ld1, LocalDate ld2) {
        return ld1.getDayOfYear() - ld2.getDayOfYear();
    }
}
