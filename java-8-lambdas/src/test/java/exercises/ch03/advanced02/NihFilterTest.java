package exercises.ch03.advanced02;

import static org.junit.Assert.*;
import static java.util.Arrays.*;

import java.util.stream.Stream;

import org.junit.Test;

public class NihFilterTest {

    @Test
    public void filters() {
        assertEquals(
            asList("ab", "c", "ef", ""),
            NihFilter.filter(
                Stream.of("ab", "Bcd", "c", "ef", "", "Abc", "ghiJ"),
                s -> s.equals(s.toLowerCase())));
    }

}
