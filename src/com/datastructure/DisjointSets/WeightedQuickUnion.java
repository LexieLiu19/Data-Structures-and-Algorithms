package com.datastructure.DisjointSets;

public class WeightedQuickUnion {
    private final int[] parent;
    private final int[] size;


    public WeightedQuickUnion(int n) {

        parent = new int[n];
        size = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            size[i] = 1;
        }
    }

    public static void main(String[] args) {
        WeightedQuickUnion wqu = new WeightedQuickUnion(5);
        wqu.union(0, 4);
        System.out.println(wqu.isConnected(0, 4));
    }

    public int root(int p) {
        if (p < 0 || p >= parent.length)
            throw new IllegalArgumentException("Index " + p + " is not valid.");
        while (p != parent[p]) p = parent[p];
        return p;
    }

    // path compress version
    public int rootPathCompress(int i) {
        while (parent[i] != i) i = parent[parent[i]];
        return i;
    }

    public boolean isConnected(int p, int q) {
        return root(p) == root(q);
    }

    // link the root of small tree to the root of larger tree
    // update the size array;
    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        if (i == j) return;
        if (size[i] < size[j]) {
            parent[i] = j;
            size[j] += size[i];
        } else {
            parent[j] = i;
            size[i] += size[j];
        }
    }
}
