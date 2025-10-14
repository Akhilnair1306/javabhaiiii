package java_BinaryTrees;

public class BST {
    private class Node {
        int value;
        private Node right;
        private Node left;
        int height;

        public Node (int value){
            this.value = value;
        }

        public int getValue(){
            return value;
        }
    }
    public BST () {

    }
    private Node root;
    private int height(Node node) {
        if ( node == null) {
            return -1;
        }
        return node.height;
    }
    public void insertHelper(int value) {
        root = insert(root, value);
    }

    private Node insert(Node node, int value) {
        if ( node == null) {
            Node newNode = new Node(value);
            return newNode;
        }

        if ( value <= node.getValue()) {
            node.left = insert(node.left, value);
        }

        if ( value > node.getValue()) {
            node.right = insert(node.right, value);
        }
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        System.out.println(node.height +" --> " + node.getValue());
        return node;
    }

    public void display() {
        display(root, "Root node: ");
    }

    private void display(Node node, String detail) {
        if ( node == null) {
            return;
        }
        System.out.println(detail + node.getValue());
        display(node.left, "Left node of: " + node.getValue() + ": ");
        display(node.right, "Right node of: " + node.getValue() + ": ");
    }

    public void populate(int[] nums) {
        for(int i = 0 ; i < nums.length; i++) {
            this.insertHelper(nums[i]);
        }
    }
}
