package dsa;

class CirNode {
	int data;
	CirNode link;
}

class cirSProcess extends CirNode {
	CirNode head = null;

	void insertAtBegin(int value) {
		CirNode newnode = new CirNode();
		newnode.data = value;
		if (head == null) {
			head = newnode;
			newnode.link = head;
		} else {
			CirNode temp = head;
			while (temp.link != head) {
				temp = temp.link;
			}
			newnode.link = head; 
			head = newnode;
			temp.link = head;
		}
	}

	void insertAtLast(int value) {
		CirNode temp = head;
		CirNode newnode = new CirNode();
		newnode.data = value;
		newnode.link = head;
		while (temp.link != head) {
			temp = temp.link;
		}
		temp.link = newnode;
	}

	void insertAtPos(int pos, int value) {
		CirNode temp = head;
		CirNode newnode = new CirNode();
		newnode.data = value;
		if (pos < 0) {
			System.out.println("invalid position");
			return;
		}
		if (pos == 0) {
			insertAtBegin(value);
			return;
		}
		while (pos != 1) {
			if (temp.link == head && pos > 0) {
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
		if (head == null) return;

		if (head.link == head) {
			head = null;
		} else {
			CirNode temp = head;
			while (temp.link != head) {
				temp = temp.link;
			}
			head = head.link;
			temp.link = head;
		}
	}

	void deleteAtLast() {
		if (head == null) return;

		if (head.link == head) {
			head = null;
			return;
		}

		CirNode temp = head;
		while (temp.link.link != head) {
			temp = temp.link;
		}
		temp.link = head;
	}

	void deleteAtPos(int pos) {
		CirNode temp = head;
		if (pos < 0) {
			System.out.println("invalid position");
			return;
		}
		if (pos == 0) {
			deleteAtBegin();
			return;
		}
		while (pos != 1) {
			if (temp.link == head && pos > 0) {
				System.out.println("invalid index");
				return;
			}
			temp = temp.link;
			pos--;
		}
		temp.link = temp.link.link;
	}

	boolean search(int value) {
		if (head == null) return false;

		CirNode temp = head;
		do {
			if (temp.data == value) return true;
			temp = temp.link;
		} while (temp != head);

		return false;
	}

	void update(int prevalue, int curvalue) {
		if (head == null) return;

		CirNode temp = head;
		do {
			if (temp.data == prevalue) {
				temp.data = curvalue;
				return;
			}
			temp = temp.link;
		} while (temp != head);
	}

	void display() {
		if (head == null) return;

		CirNode temp = head;
		do {
			System.out.println(temp.data);
			temp = temp.link;
		} while (temp != head);
	}
}
public class CircularSinglyLinkedList extends Process {
	public static void main(String args[]) {
		cirSProcess ob = new cirSProcess();
		ob.insertAtBegin(100);
		ob.insertAtBegin(200);
		ob.insertAtBegin(300);
		ob.insertAtBegin(400);
		ob.display();
		System.out.println();
		ob.insertAtLast(50);
		ob.display();
		System.out.println();
		ob.insertAtPos(3, 150);
		ob.display();
		System.out.println();
		ob.deleteAtBegin();
		ob.display();
		System.out.println();
		ob.deleteAtLast();
		ob.display();
		System.out.println();
		ob.deleteAtPos(1);
		ob.display();
		System.out.println();
		System.out.println(ob.search(300));
		ob.update(150, 750);
		ob.display();
	}
}
