package findunion;

public class QuickFind implements FindUnion {
    private final int[] id;

    public QuickFind(final int n) {
        id = new int[n];
        for (int i = 0; i < n; i++)
            id[i] = i;
    }

    public boolean connected(final int p, final int q) {
        return id[p] == id[p];
    }

    public void union(final int p, final int q) {
        final int pid = id[p];
        final int qid = id[q];
        for (int i = 0; i < id.length; i++)
            if (id[i] == pid)
                id[i] = qid;
    }
}
