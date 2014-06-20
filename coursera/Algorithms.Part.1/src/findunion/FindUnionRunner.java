package findunion;

import java.util.Random;

import utils.Runner;

public class FindUnionRunner implements Runner {
    private final FindUnion fu;
    private final int n;

    public FindUnionRunner(final FindUnion fu, final int n) {
        this.fu = fu;
        this.n = n;
    }

    public void run() {
        final Random random = new Random(System.currentTimeMillis());

        for (int i = 0; i < n / 2; i++) {
            fu.union(random.nextInt(n), random.nextInt(n));
        }

        for (int i = 0; i < n / 2; i++) {
            fu.connected(random.nextInt(n), random.nextInt(n));
        }
    }

    public int n() {
        return n;
    }
}
