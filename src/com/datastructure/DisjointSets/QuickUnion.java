package com.datastructure.DisjointSets;

public class QuickUnion implements DisjointSets {

    private final int[] parent;

    public QuickUnion(int N) {
        this.parent = new int[N];
        for (int i = 0; i < N; i++) {
            parent[i] = i;

        }
    }


    public int findRoot(int p) {
        while (p != parent[p]) {
            p = parent[p];
        }

        return p;
    }

    @Override
    public void connect(int p, int q) {
        int i = findRoot(p);
        int j = findRoot(q);
        parent[i] = j;
    }

    @Override
    public boolean isConnected(int p, int q) {
        return findRoot(p) == findRoot(q);
    }


}
