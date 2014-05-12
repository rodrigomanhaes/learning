package ch03.advanced02;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class NihFilter {

    public static <T> List<T> filter(final Stream<T> input,
            final Predicate<T> allowed) {
        return input
                .reduce(new ArrayList<T>(),
                        (list, candidate) -> {
                            if (allowed.test(candidate))
                                list.add(candidate);
                            return list;
                        },
                        (list1, list2) -> {
                            list1.addAll(list2);
                            return list1;
                        });
    }

}
