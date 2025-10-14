package java_BinaryTrees;

public class AVL {
    private class Node {
        int value;
        private Node right;
        private Node left;
        int height;

        private Node (int value){
            this.value = value;
        }

                public int getValue(){
            return value;
        }
        }
public AVL () {

}
        private Node root;
        public void insert(int value) {
          root = insert(value, root);
        }

        private Node insert(int value, Node node) {
            if ( node == null) {
                Node newNode = new Node(value);
                return newNode;
            }

            if ( value <= node.getValue()) {
                node.left = insert(value, node.left);
            }

            if ( value > node.getValue()) {
                node.right = insert(value, node.right);
            }
            node.height = Math.max(height(node.left), height(node.right)) + 1;
            return rotate(node);
        }
        private int height (Node node) {
            if ( node == null) {
                return -1;
            }
            return node.height;
        }

        private Node rotate(Node node) {
            if (height(node.left) - height (node.right) > 1) {
                if (height(node.left.left) - height(node.left.right) < 0) {
                    return rotateRight(node);
                }
                else {
                    node.left = rotateLeft(node.left);
                    return rotateRight(node);
                }
            }
            if (height(node.left) - height (node.right) < -1) {
                if (height (node.right.right) - height(node.right.left)> 0) {
                    return rotateLeft(node);
                }
                else {
                    node.right = rotateRight(node.right);
                    return rotateLeft(node);
                }
            }
            return node;
        }

    private Node rotateRight(Node node) {
        Node newRoot = node.left;
        Node movedSubtree = newRoot.right;

        // Perform rotation
        newRoot.right = node;
        node.left = movedSubtree;

        // Update heights
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        newRoot.height = Math.max(height(newRoot.left), height(newRoot.right)) + 1;

        return newRoot;
    }

    private Node rotateLeft(Node node) {
        Node newRoot = node.right;
        Node movedSubtree = newRoot.left;

        // Perform rotation
        newRoot.left = node;
        node.right = movedSubtree;

        // Update heights
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        newRoot.height = Math.max(height(newRoot.left), height(newRoot.right)) + 1;

        return newRoot;
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


}
