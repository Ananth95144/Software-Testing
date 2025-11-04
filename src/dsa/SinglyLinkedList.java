package dsa;
class Node3 {
	int data;
	Node3 link;
}

class Process extends Node3 {
	Node3 head = null;

	void insertAtBegin(int value) {
		Node3 newnode = new Node3();
		newnode.data = value;
		newnode.link = null;
		if (head == null) {
			head = newnode;
		} else {
			newnode.link = head;
			head = newnode;
		}
	}

	void insertAtLast(int value) {
		Node3 temp = head;
		Node3 newnode = new Node3();
		newnode.data = value;
		newnode.link = null;
		while (temp.link != null) {
			temp = temp.link;
		}
		temp.link = newnode;
	}

	void insertAtPos(int pos, int value) {
		Node3 temp = head;
		Node3 newnode = new Node3();
		newnode.data = value;
		newnode.link = null;
		if (pos < 0) {
			System.out.println("invalid position");
			return;
		}
		if (pos == 0) {
			insertAtBegin(value);
			return;
		}
		while (pos != 1) {
			if (temp.link == null && pos > 0) {
				System.out.println("invalid index");
				return;
			}
			temp = temp.link;
			pos--;
		}
		newnode.link = temp.link;
		temp.link = newnode;
	}

	void deleteAtBegin() {
		head = head.link;
	}

	void deleteAtLast() {
		Node3 temp = head;
		if (temp.link == null) {
			head = null;
			return;
		} else {
			while (temp.link.link != null) {
				temp = temp.link;
			}
			temp.link = null;
		}
	}

	void deleteAtPos(int pos) {
		Node3 temp = head;
		if (pos < 0) {
			System.out.println("invalid position");
			return;
		}
		if (pos == 0) {
			deleteAtBegin();
			return;
		}
		while (pos != 1) {
			if (temp.link == null && pos > 0) {
				System.out.println("invalid index");
				return;
			}
			temp = temp.link;
			pos--;
		}
		temp.link = temp.link.link;
	}

	boolean search(int value) {
		Node3 temp = head;
		while (temp != null) {
			if (temp.data == value) {
				return true;
			}
			temp = temp.link;
		}
		return false;
	}

	void update(int prevalue, int curvalue) {
		Node3 temp = head;
		if (search(prevalue)) {
			while (temp != null) {
				if (temp.data == prevalue) {
					temp.data = curvalue;
					return;
				}
				temp = temp.link;
			}
		} else {
			System.out.println("entered element not presented");
		}
	}

	void display() {
		Node3 temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.link;
		}
	}

}

public class SinglyLinkedList extends Process {
	public static void main(String args[]) {
		Process p = new Process();
		p.insertAtBegin(100);
		p.insertAtBegin(200);
		p.insertAtBegin(300);
		p.insertAtBegin(400);
		p.display();
		System.out.println("------------------");
		p.insertAtLast(50);
		p.display();
		System.out.println("------------------");
		p.insertAtPos(3, 150);
		p.display();
		System.out.println("-------------delection");
		p.deleteAtBegin();
		p.display();
		System.out.println("-------------delection");
		p.deleteAtLast();
		p.display();
		System.out.println("-------------delection");
		p.deleteAtPos(1);
		p.display();
		System.out.println(p.search(300));
		System.out.println("-------------update");
		p.update(150, 750);
		p.display();
	}

}
