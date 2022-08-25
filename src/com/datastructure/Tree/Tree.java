package com.datastructure.Tree;

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

        var node = new Node(value);
        if (root == null) {
            root = node;
            return;
        }
        var current = root;

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

        var current = root;
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

    private void traversalPostOrder(Node root) {
        if (root == null) return;
        traversalPostOrder(root.left);
        System.out.println(root.value);
        traversalPostOrder(root.right);
    }
}
