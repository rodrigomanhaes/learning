package exercises.ch05.question02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class CustomCollector {

    public static <I, O> Collector<I, Map<O, List<I>>, Map<O, List<I>>>
            groupingBy(final Function<I, O> function) {
        return new GroupingBy<>(function);
    }

}

class GroupingBy<T, K> implements Collector<T, Map<K, List<T>>, Map<K, List<T>>> {
    private final Function<T, K> function;

    public GroupingBy(final Function<T, K> function) {
        this.function = function;
    }

    @Override
    public Supplier<Map<K, List<T>>> supplier() {
        return () -> new HashMap<>();
    }

    @Override
    public BiConsumer<Map<K, List<T>>, T> accumulator() {
        return (final Map<K, List<T>> map, final T element) -> {
            final K key = function.apply(element);
            List<T> list = map.get(key);
            if (list == null) {
                list = new ArrayList<>();
                map.put(key, list);
            }
            list.add(element);
        };
    }

    @Override
    public BinaryOperator<Map<K, List<T>>> combiner() {
        return (final Map<K, List<T>> map1, final Map<K, List<T>> map2) -> {
            return new HashMap<K, List<T>>() {{
                putAll(map1);
                putAll(map2);
            }};
        };
    }

    @Override
    public Function<Map<K, List<T>>, Map<K, List<T>>> finisher() {
        return map -> map;
    }

    @Override
    public Set<Characteristics> characteristics() {
        return new HashSet<>();
    }

}