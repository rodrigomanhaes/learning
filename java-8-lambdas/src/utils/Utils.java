package utils;

import java.util.List;

public class Utils {
    public static <T> List<T> concatLists(final List<T> list1, final List<T> list2) {
        list1.addAll(list2);
        return list1;
    }
}
