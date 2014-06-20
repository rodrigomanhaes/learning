package findunion;

import java.util.stream.Stream;

import utils.Benchmark;

public class App {
    public static void main(final String[] args) {
        System.out.println("\nBenchmarking QuickFind...");
        Stream.of(10, 100, 1_000, 10_000, 100_000, 200_000, 400_000)
            .forEach(n -> Benchmark.measure(new FindUnionRunner(new QuickFind(n), n)));

        System.out.println("Benchmarking QuickUnion...");
        Stream.of(10, 100, 1_000, 10_000, 100_000, 200_000, 400_000, 1_000_000,
                  10_000_000, 20_000_000)
            .forEach(n -> Benchmark.measure(new FindUnionRunner(new QuickUnion(n), n)));

        System.out.println("Benchmarking WeightedQuickUnion...");
        Stream.of(10, 100, 1_000, 10_000, 100_000, 200_000, 400_000, 1_000_000,
                  10_000_000, 20_000_000)
            .forEach(n -> Benchmark.measure(new FindUnionRunner(new WeightedQuickUnion(n), n)));

        System.out.println("Benchmarking PathCompressionWeightedQuickUnion...");
        Stream.of(10, 100, 1_000, 10_000, 100_000, 200_000, 400_000, 1_000_000,
                  10_000_000, 20_000_000)
            .forEach(n -> Benchmark.measure(new FindUnionRunner(new PathCompressionWeightedQuickUnion(n), n)));
    }
}
