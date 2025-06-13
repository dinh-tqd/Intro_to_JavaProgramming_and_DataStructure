package chap10;

public class Ex1010 {

}

class Queue {
    private int[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 8;

    Queue() {
        elements = new int[DEFAULT_CAPACITY];
    }

    public void enqueue(int v) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 1, elements.length);
        }
        elements[0] = v;
    }

    public void dequeue() {

    }

    public int getSize() {
        return size;
    }
}
