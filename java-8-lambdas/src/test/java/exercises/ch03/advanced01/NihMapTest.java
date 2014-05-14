package exercises.ch03.advanced01;

import static org.junit.Assert.*;
import static java.util.Arrays.*;

import org.junit.Test;

public class NihMapTest {

    @Test
    public void maps() {
        assertEquals(
            asList(2, 4, 6, 8, 10),
            NihMap.map(asList(1, 2, 3, 4, 5), n -> n * 2));
    }

    @Test
    public void mapsDifferentTypes() {
        assertEquals(
            asList(1, 3, 4, 2, 1),
            NihMap.map(asList("a", "abc", "abcd", "ab", "a"), s -> s.length()));
    }
}
