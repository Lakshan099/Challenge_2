public class Queue {

    private int maxSize;
    private char queueArray[];
    private int front;
    private int rear;
    private int nItems;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        queueArray = new char[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }

    public void insert(char symWord) {
        if (isFull()) {
            System.out.println("Queue is Full");
        } else {
            if (rear == maxSize - 1) {
                rear = -1;
            }

            char ch = symWord;
            queueArray[++rear] = ch;
            nItems++;

        }
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public char remove() {
        if (isEmpty()) {
            return 0;
        } else {
            if (front == maxSize) {
                front = 0;
            }
            nItems--;
            return queueArray[front++];
        }
    }

    public char peek() {
        if (isEmpty()) {
            return 0;
        } else {

            return queueArray[front];

        }
    }

}
