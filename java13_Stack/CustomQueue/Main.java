package java13_Stack.CustomQueue;

public class Main {
    public static void main(String[] args) throws Exception{
        // CustomQueue queue = new CustomQueue(5);
        // for (int i = 0; i < 5; i++) {
        //     queue.insert(i);
        // }
        // queue.display();
        // queue.remove();
        // queue.display();
        // queue.remove();
        // queue.display();
        // queue.insert(5);
        // queue.display();
        CircularQueue cq = new CircularQueue(5);
                for (int i = 0; i < 5; i++) {
            cq.insert(i);
        }
        // cq.display();
        // cq.remove();
        // cq.display();

        DynamicQueue dq = new DynamicQueue(5);
        for (int i = 0; i < 7; i++) {
            dq.insert(i);
        }
        dq.display();
        dq.remove();
        dq.display();
    }
}
