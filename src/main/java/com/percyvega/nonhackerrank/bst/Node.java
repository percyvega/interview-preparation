package com.percyvega.nonhackerrank.bst;

public class Node {

    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }

    public static boolean isBalanced(Node node) {
        if (node.left == null && node.right == null) {
            return true;
        }

        if(Math.abs(height(node.left) - height(node.right)) > 1) {
            return false;
        }

        return isBalanced(node.left) && isBalanced(node.right);
    }

    public static int height(Node node) {
        if (node == null) {
            return 0;
        }

        return 1 + Math.max(height(node.left), height(node.right));
    }
}