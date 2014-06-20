package utils;

import java.time.Duration;
import java.time.Instant;

public class Benchmark {
    public static void measure(final Runner runner) {
        System.out.printf("%12d elements... ", runner.n());
        final Instant start = Instant.now();
        runner.run();
        final Instant end = Instant.now();
        final Duration duration = Duration.between(start, end);
        System.out.printf("%10s\n", duration);
    }
}
