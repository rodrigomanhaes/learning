package findunion;

import java.util.Arrays;

public class WeightedQuickUnion extends QuickUnion {
    private final int[] sz;

    public WeightedQuickUnion(final int n) {
        super(n);
        sz = new int[n];
        Arrays.fill(sz, 1);
    }

    @Override
    public void union(final int p, final int q) {
        final int i = root(p);
        final int j = root(q);
        if (i == j)
            return;
        if (sz[i] < sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
        }
        else {
            id[j] = i;
            sz[i] += sz[j];
        }
    }
}
