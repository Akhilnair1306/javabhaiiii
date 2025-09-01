package java12_LinkedList.CustomLinkedList;

public class CustLL {
    private Node head;
    private Node tail;
    private int size;
    public CustLL() {
        this.size = 0;
    }

    public void insertatFirst(int value) {
        Node node = new Node(value);
        // node.value = value;
        node.next = head;
        head = node;

        if( tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void display() {
        Node temp = head;
        temp = head;
        while (temp != null) {
            System.out.print(temp.value + " --> ");
            temp = temp.next;
        }
        System.out.println("END");
        // System.out.println(size);
    }

    public void insertatLast(int value) {
        Node node = new Node(value);
        if(tail == null) {
            insertatFirst(value);
            return;
        }
        // Node temp = head;
        // while(temp != null) {
        //     temp = temp.next;
        // }
        // temp = node;
        tail.next = node;
        tail = node;
        size += 1;
        // System.out.println(temp.value);
    }

    public void insertAtPos (int value, int pos) {
        if ( pos >= size) {
            System.out.println("POSITION OUT OF BOUNDS");
            return;
        }
        if ( pos == 0) {
            insertatFirst(value);
            return;
        } else if ( pos == size - 1) {
            insertatLast(value);
            return;
        } else {
            
            Node temp = head;
            int counter = 0;
            while (counter < pos - 1) {
                temp = temp.next;
                counter++;
            }
            // node.next = temp.next;
            Node node = new Node(value, temp.next);
            temp.next = node;
            size += 1;
        }
    }

    public void deleteFirst() {
        head = head.next;
        if ( head == null) {
            tail = head;
        }
        size -= 1;
        return;
    }

    public void deleteLast() {
     Node temp = get(size - 2);
    //  for ( int i = 1; i < size - 1; i++) {
    //     temp = temp.next;
    //  }
    //  temp.next = tail.next;
     tail = temp;
     tail.next = null;
     size -= 1;
    }

    public Node get(int value) {
        Node node = head;
        for(int i = 0; i < value; i++) {
            node = node.next;
        }
        return node;
    }

    public void deleteatPos( int pos) {
        if (pos == 0 ) {
            deleteFirst();
            return;
        } else if ( pos == size - 1) {
            deleteLast();
            return;
        } else {
            Node node = get(pos);
            Node temp = get( pos - 1);
            temp.next = node.next;
            node = temp;
            // System.out.println(node.value);

        }
        size -= 1;
    }

    //INSERT USING RECURSION
    public void insertRec(int val, int index) {
      head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = insertRec(val, index - 1, node.next);
        return node;
    }

    public void ReverseLLHelper (CustLL LL) {
        head = ReverseLL( head);
        LL.display();
    }
    public Node ReverseLL ( Node temp) {
        // Node node = head;
        if ( temp.next == null || temp == null) {
            return temp;
        }
        Node newHead = ReverseLL(temp.next);
        temp.next.next = temp;
        temp.next = null;
        return newHead;
    }
    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
