package ch03.question07;
import java.util.Comparator;
import java.util.List;

public class StringsLowercaseLetter {

    public static String find(final List<String> strings) {
        return strings.stream()
                .max(Comparator.comparing(s -> s.length()))
                .get();
    }

}