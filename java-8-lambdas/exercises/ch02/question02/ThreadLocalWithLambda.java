package ch02.question02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ThreadLocalWithLambda {
    public static void main(final String[] args) {
        final ThreadLocal<DateTimeFormatter> threadLocal = ThreadLocal
            .withInitial(() -> DateTimeFormatter.ofPattern("dd-MMM-YYYY"));
        System.out.println(threadLocal.get().format(LocalDate.now()));
    }
}
