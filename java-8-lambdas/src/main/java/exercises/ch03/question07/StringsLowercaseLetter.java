package exercises.ch03.question07;

import java.util.Comparator;
import java.util.List;

public class StringsLowercaseLetter {

    public static String find(final List<String> list) {
        return list.stream()
                .max(Comparator.comparing((final String s) -> {
                    return s.chars().filter(c -> Character.isLowerCase(c)).count();
                }))
                .get();
    }
}
