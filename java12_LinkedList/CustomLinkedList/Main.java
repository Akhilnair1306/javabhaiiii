package java12_LinkedList.CustomLinkedList;

public class Main {
    public static void main(String[] args) {
        CustLL Linked = new CustLL();
        Linked.insertatFirst(4);
        Linked.insertatFirst(40);
        Linked.insertatFirst(400);
        Linked.insertatFirst(4000);
        Linked.insertatLast(50);
        Linked.insertatLast(90);
        Linked.display();
        Linked.insertRec(43, 3);
        Linked.display();
        // Linked.deleteFirst();
        // Linked.display();
        // Linked.deleteLast();
        // Linked.display();
        // Linked.deleteatPos( 3);
        // Linked.display();
        // Linked.deleteatPos( 3);
        // Linked.display();
        Linked.ReverseLLHelper(Linked);

        // CustDoublyLL LinkedDouble = new CustDoublyLL();
        // LinkedDouble.insertatFirst(10);
        // LinkedDouble.insertatFirst(20);
        // LinkedDouble.insertatFirst(30);
        // LinkedDouble.insertatLast(50);
        // LinkedDouble.insertatLast(40);
        // LinkedDouble.insertatVal(10, 100);
        // LinkedDouble.display();
        // LinkedDouble.deletehead();
        // LinkedDouble.display();
        // LinkedDouble.deleteTail();
        // LinkedDouble.display();
        // LinkedDouble.deleteVal(100);
        // LinkedDouble.display();
        // LinkedDouble.deleteVal(10);
        // LinkedDouble.display();

        // CustCircleLL LinkCircle = new CustCircleLL();
        // LinkCircle.insertatFirst(10);
        // LinkCircle.insertatFirst(20);
        // LinkCircle.insertatFirst(30);
        // LinkCircle.insertatFirst(40);
        // LinkCircle.display();
        // LinkCircle.deleteFirst();
        // LinkCircle.insertatFirst(50);
        // LinkCircle.display();
    }
}
