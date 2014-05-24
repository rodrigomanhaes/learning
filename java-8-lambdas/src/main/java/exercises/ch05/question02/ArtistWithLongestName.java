package exercises.ch05.question02;

import static java.util.stream.Collectors.*;
import static java.util.Comparator.*;

import java.util.stream.Stream;

public class ArtistWithLongestName {

    public static String find(final Stream<String> stream) {
        return stream.collect(maxBy(comparing(String::length))).get();
    }

}
