package collections;

import java.util.LinkedList;
import java.util.Queue;

public class ArrayQueue {

	public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Orange");
        System.out.println("Queue: " + queue); // Output: [Apple, Banana, Orange]
        System.out.println("Peek " + queue.peek()); // Output: Apple
        System.out.println("Removed: " + queue.poll()); // Output: Removed: Apple
       
	}

}
