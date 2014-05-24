package exercises.ch05.question02;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.stream.Stream;

import org.junit.Test;

public class WordCountTest {

    @Test
    public void countsWordsOccurrences() {
        assertEquals(
            new HashMap<String, Long>() {{
                put("John", 3L);
                put("Paul", 2L);
                put("George", 1L);
            }},
            WordCount.countOccurrences(
                Stream.of("John", "Paul", "George", "John", "Paul", "John"))
        );
    }

}
