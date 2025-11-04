package dsa;
class Queue {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int currentSize;

    public Queue(int size) {
        this.maxSize = size;
        this.queueArray = new int[maxSize];
        this.front = 0;
        this.rear = -1;
        this.currentSize = 0;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + value);
        } else {
            rear = (rear + 1) % maxSize; // Circular increment
            queueArray[rear] = value;
            currentSize++;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty. Cannot dequeue.");
        } else {
            int frontValue = queueArray[front];
            front = (front + 1) % maxSize; 
            currentSize--;
            return frontValue;
        }
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty. Cannot peek.");
        } else {
            return queueArray[front];
        }
    }

    public boolean isEmpty() {
        return (currentSize == 0);
    }

    public boolean isFull() {
        return (currentSize == maxSize);
    }

    public int size() {
        return currentSize;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.print("Queue elements: ");
            for (int i = 0; i < currentSize; i++) {
                int index = (front + i) % maxSize;
                System.out.print(queueArray[index] + " ");
            }
            System.out.println();
        }
    }
}

public class DSA_ArrayQueue {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Queue after enqueuing elements:");
        queue.display();

        System.out.println("Peek front element: " + queue.peek());

        System.out.println("Dequeue front element: " + queue.dequeue());

        System.out.println("Queue after dequeuing an element:");
        queue.display();

        System.out.println("Is queue empty? " + queue.isEmpty());

        System.out.println("Is queue full? " + queue.isFull());

        System.out.println("Current size of queue: " + queue.size());
    }
}
