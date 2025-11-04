package dsa;

class Q1Node{
	Q1Node link;
	int data;
	int first;
	int rear;
	Q1Node(int value){
		link=null;	
		data=value;
	}
}
class Q1process{
	Q1Node first=null;
	Q1Node last=null;
	
		void enqueue(int value) {
			Q1Node newQ1Node = new Q1Node(value);
			if(last==null) {
				last = newQ1Node;
				first=newQ1Node;
			}else {
				last.link=newQ1Node;
				last=newQ1Node;
			}
		}
		void dequeue() {
			  if (first == null) {
		            System.out.println("Queue is empty");
		            return;
		        }
		
		        first = first.link;

		        if (first == last) { 
		        	last = null;
		        }
		}
		void display() {
			
			if(first!=null) {
			Q1Node temp = first;
			while(temp!=null) {
				System.out.println(temp.data);
				temp = temp.link;
			}}
		}
}
public class QueueLinkedlist {
		
	public static void main(String[] args) {
		Q1process ob = new Q1process();
		ob.enqueue(10);
		ob.enqueue(20);
		ob.enqueue(30);
		ob.enqueue(40);
		ob.display();
		System.out.println("-----");
		ob.dequeue();
		ob.display();
		System.out.println("-----");
		ob.dequeue();
		ob.display();
		System.out.println("-----");
		ob.dequeue();
		ob.display();
		System.out.println("-----");
		ob.dequeue();
		ob.display();
		System.out.println("-----");
		ob.dequeue();
		ob.display();
		System.out.println("-----");
		ob.dequeue();
		ob.display();
	}
}
