package com.datastructure.Tree;


import static java.lang.Math.max;
import static java.lang.Math.min;

public class Tree {

    private class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node = " + value;
        }
    }

    public Node root;


    public void insert(int value) {

        Node node = new Node(value);
        if (root == null) {
            root = node;
            return;
        }
        Node current = root;

        while (true) {
            if (value < current.value) {
                if (current.left == null) {
                    current.left = node;
                    break;
                }
                current = current.left;
            }

            if (value >= current.value) {
                if (current.right == null) {
                    current.right = node;
                    break;
                }
                current = current.right;
            }
        }

    }


    public boolean find(int value) {
        if (root == null) return false;

        Node current = root;
        while (current != null) {
            if (current.value > value) {
                current = current.left;
            } else if (current.value < value) {
                current = current.right;
            } else {
                return true;
            }
        }
        return false;
    }

    public void traversalPreOrder() {
        traversalPreOrder(root);
    }

    private void traversalPreOrder(Node root) {
        if (root == null) return;
        System.out.println(root.value);
        traversalPreOrder(root.left);
        traversalPreOrder(root.right);
    }

    public void traversalPostOrder() {
        traversalPostOrder(root);
    }

    public int height() {
        return height(root);
    }

    public int findMin() {
        return findMin(root);
    }

    private int findMin(Node root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }

        int res = root.value;
        int left = findMin(root.left);
        int right = findMin(root.right);

        return min(min(left, right), res);


    }


    public int findMinBST() {
        return findMinBST(root);
    }

    private int findMinBST(Node root) {
        if (root == null) return Integer.MAX_VALUE;
        Node current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.value;
    }

    private boolean isLeaf(Node node) {
        return (node.left == null && node.right == null);
    }

    private int height(Node root) {
        if (root == null) return -1;
        if (isLeaf(root)) return 0;

        return 1 + max(height(root.left), height(root.right));

    }

    private void traversalPostOrder(Node root) {
        if (root == null) return;
        traversalPostOrder(root.left);
        System.out.println(root.value);
        traversalPostOrder(root.right);
    }
}
