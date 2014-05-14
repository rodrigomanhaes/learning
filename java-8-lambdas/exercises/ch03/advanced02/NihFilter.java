package ch03.advanced02;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

import utils.Utils;

public class NihFilter {

    public static <T> List<T> filter(final Stream<T> input,
            final Predicate<T> allowed) {
        return input
                .reduce(new ArrayList<T>(),
                        (final List<T> list, final T candidate) -> {
                            if (allowed.test(candidate))
                                list.add(candidate);
                            return list;
                        },
                        Utils::concatLists);
    }

}
