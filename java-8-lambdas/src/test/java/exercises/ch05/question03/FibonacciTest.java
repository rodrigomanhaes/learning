package exercises.ch05.question03;

import static org.junit.Assert.*;
import static java.util.Arrays.*;

import org.junit.Test;

public class FibonacciTest {

    @Test
    public void calculate() {
        assertEquals(
            asList(1, 1, 2, 3, 5, 8, 13, 21, 34, 55),
            Fibonacci.upTo(10));
    }

}
