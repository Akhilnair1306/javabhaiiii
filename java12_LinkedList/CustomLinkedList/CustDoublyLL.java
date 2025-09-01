package java12_LinkedList.CustomLinkedList;

public class CustDoublyLL {

    private Node head;
    private Node tail;
    int size;

    public CustDoublyLL () {
        this.size = 0;
    }
    public void insertatFirst(int value) {
        Node node = new Node(value);
        if ( head == null) {
            head = node;
            head.next = null;
            head.prev = null;
            tail = head;
        } else {
            node.next = head;
            node.prev = null;
            head.prev = node;
            head = node;
        }
        size += 1;
    }

    public void display() {
        Node temp = head;
        Node revtemp = tail;
        while( temp != null) {
            System.out.print(temp.value + " ---> ");
            temp = temp.next;
        }
        System.out.println("ENDINGS");

        System.out.println("Reverse Printings");

        while ( revtemp != null) {
            System.out.print(revtemp.value + " ---> ");
            revtemp = revtemp.prev;
        }

        System.out.println("STARTINGS");
    }

    public void insertatLast(int value) {
        Node node = new Node(value);
        if ( tail == null) {
            insertatFirst(value);
            return;
        }
        node.prev = tail;
        node.next = null;
        tail.next = node;
        tail = node;
        size += 1;
    }

    public void insertatVal(int after, int value) {
         if ( after == tail.value) {
            insertatLast(value);
        } else {
            Node newNode = new Node(value);
            Node node = find(after);
            newNode.next = node.next;
            newNode.prev = node;
            node.next.prev = newNode;
            node.next = newNode;
        }
        
    }

    public Node find (int after) {
        Node temp = head;
        while ( temp != null) {
            if ( temp.value == after) {
                return temp;
            }
            temp  = temp.next;
        }
        return temp;
    }

    public void deletehead() {
        head = head.next;
        head.prev = null;
    }

    public void  deleteTail() {
        tail = tail.prev;
        tail.next = null;
    }

    public void deleteVal(int val) {
        if ( val == head.value) {
            deletehead();
        } else if ( val == tail.value) {
            deleteTail();
        } else {
            Node node = find(val);
            // System.out.println(node.value);
            // System.out.println(node.next.value);
            // System.out.println(node.prev.next.value);
            // System.out.println(node.prev.value);
            // System.out.println(node.next.prev.value);
            node.next.prev = node.prev;
            node.prev.next = node.next; 
        }
    }
    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
