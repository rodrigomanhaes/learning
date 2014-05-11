package ch03.question07;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringsLowercaseLetterTest {
    @Test
    public void findsStringWithLargestNumberOfLowercaseLetters() {
        assertEquals("nadanao", StringsLowercaseLetter.find(
                asList("teste", "coisaLOUCa", "nadanao", "algo assIM")));
    }
}
