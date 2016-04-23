package com.thoughtworks.tw101.exercises.exercise9;

import java.util.List;

public class Node {
    private String name;
    private Node left;
    private Node right;

    public Node(String name) {
        this.name = name;
    }

    public void add(String nameOfNewNode) {
        int compare = nameOfNewNode.compareTo(name);
        if (compare < 0) {
            if (left == null) {
                left = new Node(name);
            } else {
                left.add(nameOfNewNode);
            }
        } else {
            if(right == null) {
                right = new Node(name);
            } else {
                right.add(nameOfNewNode);
            }
        }
    }

    public List<String> names() {
        return null;
    }
}
