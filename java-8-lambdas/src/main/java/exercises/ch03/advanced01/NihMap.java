package exercises.ch03.advanced01;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import utils.Utils;

public class NihMap {
    public static <O, I> List<O> map(final List<I> list, final Function<I, O> mapper) {
        return list.stream()
                .reduce(new ArrayList<O>(),
                        (final List<O> theList, final I element) -> {
                            theList.add(mapper.apply(element));
                            return theList;
                        },
                        Utils::concatLists
                );
    }
}
