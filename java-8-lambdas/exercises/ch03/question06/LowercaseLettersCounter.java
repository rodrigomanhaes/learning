package ch03.question06;

public class LowercaseLettersCounter {
    public static long count(final String string) {
        return string.chars()
                .filter(c -> Character.isLowerCase(c))
                .count();
    }
}
