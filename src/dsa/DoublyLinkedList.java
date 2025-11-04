package dsa;
class DNode{
	int data;
	DNode pre;
	DNode next;
}
class DProcess{
	DNode head;
	DNode tail;
	
		void insertAtBegin(int value) {
			DNode newnode = new DNode();
			newnode.data=value;
			newnode.pre=null;
			newnode.next=null;
			if(head==null) {
				head =newnode;
				tail =newnode;
			}else {
				newnode.next=head;
				head.pre=newnode;
				head=newnode;
			}
		}
		void insertAtlast(int value) {
			DNode newnode = new DNode();
			newnode.data=value;
			newnode.pre=null;
			newnode.next=null;
			tail.next=newnode;
			newnode.pre=tail;
			tail=newnode;
		}
		void insertAtPos(int pos,int value) {
			DNode newnode = new DNode();
			newnode.data=value;
			newnode.pre=null;
			newnode.next=null;
			if(pos<0) {
				System.out.println("Invalid index");
				return;
			}
			if(pos==0) {
				insertAtBegin(value);
				return;
			}
			DNode temp=head;
			for(int i=0;i<pos-1 && temp!=null;i++ ) {
				temp=temp.next;
			}
			if(temp==null) {
				System.out.println("Invalid index");
			}else if(temp.next != null) {
				temp.next.pre=newnode;
				newnode.next= temp.next;
				temp.next=newnode;
				newnode.pre=temp;
				
			}else {
				insertAtlast(value);
			}
		}
		void deleteAtBegin() {
			head=head.next;//  head to tail
			DNode temp=tail; 
			DNode prev=null;
			while(temp.pre!=null) { 
				prev=temp;
				temp=temp.pre;
			}
			prev.pre=null; // tail to head
		}
		void deleteAtLast() {
			tail=tail.pre; // tail to head
			DNode  temp = head;
			DNode  prev=null;
			while(temp.next!=null) {
				prev=temp;
				temp = temp.next;
			}
			prev.next=null; // head to tail
		}
		void deleteAtPos(int pos) {
			if(pos<0) {
				System.out.println("Invalid index");
				return;
			}
			if(pos==0) {
				deleteAtBegin();
				return;
			}
			DNode temp=head;
			for(int i=0;i<pos-1 && temp!=null;i++ ) {
				temp=temp.next;
			}
			if(temp==null) {
				System.out.println("Invalid index");
			}else if(temp.next!=null) {
				if(temp.next.next!=null) {
					temp.next.next.pre=temp;
				temp.next=temp.next.next;
				
				}
				else 
					deleteAtLast();
			}else {
				System.out.println("Invalid index");
			}
			
		}
		void update(int prevalue,int curvalue) {
			DNode temp = head;
			boolean flag = false;
			while(temp!=null) {
				if(prevalue==temp.data) {
					temp.data=curvalue;
					flag=true;
				}   
				temp=temp.next;
			}
			if(!flag) {
				System.out.println(prevalue+" is not present");
			}
		}
		void  display() {
			DNode temp=head;
			while(temp!=null) {
				System.out.println(temp.data);
				temp=temp.next;
			}
			System.out.println();
		}
		void  revdisplay() {
			DNode temp=tail;
			while(temp!=null) {
				System.out.println(temp.data);
				temp=temp.pre;
			}
			System.out.println();
		}
}
class DoublyLinkedList {
	public static void main(String[] args) {
		DProcess obj = new DProcess();
		obj.insertAtBegin(20);
		obj.insertAtBegin(10);
		obj.insertAtBegin(5);
//		obj.display();obj.revdisplay();
		obj.insertAtlast(30);
//		obj.display();obj.revdisplay();
		obj.insertAtPos(2, 15);
		obj.display();obj.revdisplay();
		obj.deleteAtBegin();
		obj.display();obj.revdisplay();
		obj.deleteAtLast();
		obj.display();obj.revdisplay();
		obj.deleteAtPos(1);
		obj.display();obj.revdisplay();
		obj.update(20,200);
		obj.display();obj.revdisplay();
		
	}
}