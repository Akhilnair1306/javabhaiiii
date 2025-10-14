package java_BinaryTrees;

import java.util.Scanner;

class BinaryTrees {

    private Node root;
    public BinaryTrees() {

    }

    public void insert(Scanner scanner) {
        System.out.println("Enter the value for the root Node");
        int value = scanner.nextInt();
        root = new Node(value);
        insert(scanner, root);
    }

    private void insert (Scanner scanner, Node node) {
        System.out.println("Do you want a left node for " + node.value);
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("Enter the value for the left node");
            int value = scanner.nextInt();
            node.left = new Node(value);
            insert(scanner, node.left);
        }
        System.out.println("Do you want a right node for " + node.value);
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("Enter the value for the right node");
            int value = scanner.nextInt();
            node.right = new Node(value);
            insert(scanner, node.right);
        }
    }

    public void display() {
        display(root, "");
    }

    private void display(Node node, String indent) {
        if(node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent +"\t");
        display(node.right, indent + "\t");
    }
    private class Node {
        int value;
        Node left;
        Node right;

        private Node(int value) {
            this.value = value;
        }
    }
}
