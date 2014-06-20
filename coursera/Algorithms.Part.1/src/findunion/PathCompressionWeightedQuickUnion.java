package findunion;

public class PathCompressionWeightedQuickUnion extends WeightedQuickUnion {
    public PathCompressionWeightedQuickUnion(final int n) {
        super(n);
    }

    @Override
    protected int root(final int x) {
        int i = x;
        while (i != id[i]) {
            id[i] = id[id[i]];
            i = id[i];
        }
        return i;
    }
}
