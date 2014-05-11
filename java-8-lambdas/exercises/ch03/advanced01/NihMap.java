package ch03.advanced01;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class NihMap {
    public static <O, I> List<O> map(final List<I> list, final Function<I, O> mapper) {
        return list.stream()
                .reduce(new ArrayList<O>(),
                        (theList, element) -> {
                            theList.add(mapper.apply(element));
                            return theList;
                        },
                        (list1, list2) -> {
                            list1.addAll(list2);
                            return list1;
                        }
                );
    }
}
