package java13_Stack.CustomQueue;

public  class CircularQueue extends CustomQueue{
    int size = 0;
    public CircularQueue () {
        super();
    }

    public CircularQueue (int size) {
        super(size);
    }

    int front = 0;
    int end = 0;

    @Override
    public boolean insert(int item) throws Exception{
        if (isFull()) {
            throw new Exception("Stack bhar gaya bhai");
        }
        data[end++] = item;
        end = end % data.length;
        // System.out.println(data.length);
        size++;
        return true;
    }

    @Override
    public boolean isFull() {
        return size == data.length;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int remove() throws Exception{
        if (isEmpty()) {
            throw new Exception("khaali queue hai bhai");
        }

        int remove  = data[front];
        front++;
        front = front % data.length;
        size--;
        return remove;
    }

    @Override
    public void display() {
        int i = front;
        // System.out.println(end);
        do {
            System.out.print(data[i]);
            System.out.print(" -- >");
            i++;
            i = i % data.length;
        } while (i != end);
        System.out.println("END");
    }
}
