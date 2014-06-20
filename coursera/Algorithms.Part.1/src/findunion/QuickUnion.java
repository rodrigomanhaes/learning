package findunion;

public class QuickUnion implements FindUnion {
    protected final int id[];

    public QuickUnion(final int n) {
        id = new int[n];
        init(n);
    }

    private void init(final int n) {
        for (int i = 0; i < n; i++)
            id[i] = i;
    }

    protected int root(final int x) {
        int i = x;
        while (i != id[i]) i = id[i];
        return i;
    }

    public boolean connected(final int p, final int q) {
        return root(p) == root(q);
    }

    public void union(final int p, final int q) {
        final int i = root(p);
        final int j = root(q);
        id[i] = j;
    }
}
