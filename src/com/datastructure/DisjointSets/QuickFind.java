package com.datastructure.DisjointSets;


//using array of indices to refer elements
public class QuickFind implements DisjointSets {

    private final int[] id;

    public QuickFind(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public static void main(String[] args) {

        QuickFind qf = new QuickFind(6);
        qf.connect(1, 5);
        qf.connect(2, 3);


    }

    @Override
    public void connect(int p, int q) {
        int pId = id[p];
        int qId = id[q];
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pId) {
                id[i] = qId;
            }
        }

    }

    @Override
    public boolean isConnected(int p, int q) {
        return id[p] == id[q];
    }
}
