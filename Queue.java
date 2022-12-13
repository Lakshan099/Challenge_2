public class Queue {

    //Queue

    private int maxSize;
    private Characters queueArray[];
    private int front;
    private int rear;
    private int nItems;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        queueArray = new Characters[maxSize];
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

            Characters ch = new Characters(symWord);
            queueArray[++rear] = ch;
            nItems++;

        }
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public Characters remove() {
        if (isEmpty()) {
            return null;
        } else {
            if (front == maxSize) {
                front = 0;
            }
            nItems--;
            return queueArray[front++];
        }
    }

    public Characters peek() {
        if (isEmpty()) {
            return null;
        } else {

            return queueArray[front];

        }
    }

}
