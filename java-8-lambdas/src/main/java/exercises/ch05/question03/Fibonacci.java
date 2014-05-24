package exercises.ch05.question03;

import static java.util.stream.Collectors.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fibonacci {

    private static Map<Integer, Integer> map;

    public static List<Integer> upTo(final int i) {
        map = new HashMap<Integer, Integer>() {{
            put(1, 1);
            put(2, 1);
        }};
        calculate(i);
        return map.values().stream().sorted().collect(toList());
    }

    private static Integer calculate(final int limit) {
        return map.computeIfAbsent(limit, n -> calculate(n - 1) + calculate(n - 2));
    }
}
