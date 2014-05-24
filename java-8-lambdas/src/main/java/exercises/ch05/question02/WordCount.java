package exercises.ch05.question02;

import java.util.Map;
import java.util.stream.Stream;
import static java.util.stream.Collectors.*;

public class WordCount {

    public static Map<String, Long> countOccurrences(final Stream<String> stream) {
        return stream.collect(groupingBy(s -> s, counting()));
    }

}
