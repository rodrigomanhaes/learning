package question06;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LowercaseLettersCounterTest {
    @Test
    public void countsLowercaseLetters() {
        assertEquals(4, LowercaseLettersCounter.count("TeStAnDo"));
        assertEquals(11, LowercaseLettersCounter.count("alguma OUTRA coisa"));
    }
}
