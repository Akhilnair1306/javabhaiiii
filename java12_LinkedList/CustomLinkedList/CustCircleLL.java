package java12_LinkedList.CustomLinkedList;

public class CustCircleLL {

    private Node head;
    private Node tail;
    private int size;
    public CustCircleLL () {
        this.size = size;
    }

    public void insertatFirst (int val) {
        Node node  = new Node(val);
        if ( head == null) {
            head = node;
            tail = node;
        }
        node.next  = head;
        tail.next = node;
        head = node;
    }

    public void deleteFirst () {
        tail.next = head.next;
        head = head.next;
    }

    public void display () {
        Node temp = head;
        if ( temp != null) {
            do {
                System.out.print(temp.val + "  --> ");
                temp = temp.next;
            } while (temp != head);
        }
        System.out.println("ENDINGS");
        // System.out.println(temp.val);
    }
    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
