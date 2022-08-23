package com.datastructure.HashTables.Exercise;

import java.util.LinkedList;

//Todo: need to fix bugs in put() function
/*
 * Build a HashTable
 * Methods:
 * put(k,v);
 * get(k);
 * remove(k);
 * k:int;
 * v:String
 * collision: LinkedList
 * LinkedList<Entry>[]
 * [LL,LL,LL,LL]
 * */
public class MyHashTables {

    private class Entry {
        private int key;
        private String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private final LinkedList<Entry>[] entries = new LinkedList[5];


    public void put(int key, String value) {
        var entry = getEntry(key);
        if (entry != null) {
            entry.value = value;
            return;
        }
        getOrCreateBucket(key).add(new Entry(key, value));
    }

    public String get(int key) {
        var entry = getEntry(key);
        return (entry == null) ? null : entry.value;
    }

    public void remove(int key) {
        var entry = getEntry(key);
        if (entry == null) throw new IllegalStateException();
        var bucket = getBucket(key);
        bucket.remove(entry);
    }

    private int hash(int key) {
        return key % entries.length;
    }

    private LinkedList<Entry> getBucket(int key) {
        return entries[hash(key)];
    }

    private LinkedList<Entry> getOrCreateBucket(int key) {
        var index = hash(key);
        var bucket = entries[index];
        if (bucket == null) {
            entries[index] = new LinkedList<>();
        }
        return bucket;

    }

    private Entry getEntry(int key) {
        var bucket = getBucket(key);
        if (bucket != null) {
            for (var entry : bucket) {
                if (entry.key == key) return entry;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        MyHashTables table = new MyHashTables();
        table.put(6, "A");//1
        table.put(8, "B");//3
        table.put(11, "C");//1
//        table.remove(8);
        System.out.println(table.get(11));
    }
}
