package day10;

import java.util.*;

public class Tree {
    private Node root;

    public Tree() {
        root = null;
    }

    public void add(int value) {
        Node newNode = new Node(value);

        if (root == null) {
            root = newNode;
        } else {
            Node curr = root;
            Node parent;
            while (true) {
                parent = curr;
                if (value == curr.getValue()) {
                    return;
                } else if (value < curr.getValue()) {
                    curr = curr.left;
                    if (curr == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    curr = curr.right;
                    if (curr == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    public void show() {
        root.traverseInOrder(root);
    }

    private static class Node {
        private final int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public Node getLeftChild() {
            return left;
        }

        public Node getRightChild() {
            return right;
        }

        public void traverseInOrder(Node node) {
            if (node != null) {
                traverseInOrder(node.left);
                System.out.print(node.value + " ");
                traverseInOrder(node.right);
            }
        }
    }
}
