package java_BinaryTrees;

public class SegmentTrees {
    private class Node {
        int value;
        int firstIndex;
        int lastIndex;
        Node left;
        Node right;

        private Node (int value, int firstIndex, int lastIndex) {
            this.value = value;
            this.firstIndex = firstIndex;
            this.lastIndex = lastIndex;
        }
    }
    private Node root;
    public SegmentTrees () {

    }
    public void insert(int[] arr) {
       root =  insertHelper(arr, 0 , arr.length - 1);
    }
    private Node insertHelper(int[] arr, int firstIndex, int lastIndex) {
        if (firstIndex == lastIndex) {
            Node node = new Node(arr[firstIndex], firstIndex, lastIndex);
            return node;
        }
        int value = 0;
        for (int i = firstIndex; i <= lastIndex; i++) {
            value += arr[i];
        }
        Node node = new Node(value, firstIndex, lastIndex);
        int mid = (firstIndex + lastIndex) /2;
        node.left = insertHelper(arr, firstIndex, mid);
        node.right = insertHelper(arr, mid + 1, lastIndex);
        return node;
    }

    public void findRangeSum(int firstIndex, int lastIndex) {
        int ans = rangeSum (root, firstIndex, lastIndex, 0);
        System.out.println(ans);
    }

    private int rangeSum(Node node, int firstIndex, int lastIndex, int value) {
        if (firstIndex == node.firstIndex && lastIndex == node.lastIndex) {
            return node.value;
        }

        if (firstIndex > node.firstIndex && lastIndex < node.lastIndex) {
            value = rangeSum(node.left, firstIndex, lastIndex, value);
            value = rangeSum(node.right, firstIndex, lastIndex, value);
        }

        if (firstIndex > node.firstIndex && lastIndex > node.lastIndex) {
            value = rangeSum(node.right, firstIndex, lastIndex,value);
        }

        if ( firstIndex == node.firstIndex && lastIndex > node.lastIndex) {
            return value + node.value;
        } 

        if ( firstIndex < node.firstIndex && lastIndex < node.lastIndex) {
            value = rangeSum(node.left, firstIndex, lastIndex, value);
            value = rangeSum(node.right, firstIndex, lastIndex, value);
        }
        
        if ( firstIndex < node.firstIndex && lastIndex > node.lastIndex) {
            return value + node.value;
        }

        if (firstIndex < node.firstIndex && lastIndex == node.firstIndex) {
           return node.left.value + value;
        }

        if (firstIndex < node.firstIndex && lastIndex == node.lastIndex) {
           return node.value + value;
        }


        return value;

    }
        public void display() {
        display(root, "Root node: ");
    }
            private void display(Node node, String detail) {
        if ( node == null) {
            return;
        }
        System.out.println(detail + " " + node.value + " " +  node.firstIndex + " " + node.lastIndex);
        display(node.left, "Left node of: " + node.value);
        display(node.right, "Right node of: " + node.value);
    }
}
