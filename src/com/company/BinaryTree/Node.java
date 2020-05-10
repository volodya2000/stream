package com.company.BinaryTree;

public class Node {

    private int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
        left=right=null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
