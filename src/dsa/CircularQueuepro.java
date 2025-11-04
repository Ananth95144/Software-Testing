package dsa;
class CircularQueue {
    int[] arr;
    int front, rear, size, capacity;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    boolean isFull() {
        return size == capacity;
    }

    boolean isEmpty() {
        return size == 0;
    }

    void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        if (isEmpty()) {
            front = 0;
        }

        rear = (rear + 1) % capacity;
        arr[rear] = value;
        size++;
    }
    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;  
        }
        front = (front + 1) % capacity;
        size--;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1; 
        }
        return arr[front];
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        int count = size;
        int i = front;
        while (count > 0) {
            System.out.print(arr[i] + " ");
            i = (i + 1) % capacity;
            count--;
        }
        System.out.println();
    }
}

public class CircularQueuepro {
    public static void main(String[] args) {
    	CircularQueue q = new CircularQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        q.display();

        q.dequeue();
        q.dequeue();
        q.dequeue();
//        q.dequeue();
//        q.dequeue();
        q.enqueue(60);
        q.enqueue(70);
        q.enqueue(80);
        q.display();
        

        System.out.println(q.peek()); 

        System.out.println(q.isEmpty()); 
    }
}
