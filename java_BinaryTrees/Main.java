package java_BinaryTrees;

// import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // BinaryTrees binaryTree = new BinaryTrees();
        // binaryTree.insert(scanner);
        // binaryTree.display();
        // BST tree = new BST();
        // int[] nums = {5,10, 3, 9 ,2,6,1};
        // tree.populate(nums);
        // tree.display();

        // AVL tree = new AVL();
        // for (int i = 0; i <=10 ; i++) {
        //     tree.insert(i);
        // }
        // tree.display();
        SegmentTrees tree = new SegmentTrees();
        int[] arr = {3,8,7,6,-2,-8,4,9};
        tree.insert(arr);
        tree.display();
        tree.findRangeSum(2, 6);
    }
}
