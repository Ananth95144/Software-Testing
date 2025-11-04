package dsa;
class Nodec{
	int data;
	Nodec pre;
	Nodec next;
}
class Processc{
	Nodec head;
	Nodec tail;
	
		void insertAtBegin(int value) {
			Nodec newnode = new Nodec();
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
				head.pre=tail;
				tail.next=head;
			}
		}
		void insertAtlast(int value) {
			Nodec newnode = new Nodec();
			newnode.data=value;
			newnode.pre=null;
			newnode.next=null;
			tail.next=newnode;
			newnode.pre=tail;
			tail=newnode;
			head.pre=tail;
			tail.next=head;
		}
		void insertAtPos(int pos,int value) {
			Nodec newnode = new Nodec();
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
			Nodec temp=head;
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
			Nodec temp=tail; 
			Nodec prev=null;
			do{ 
				prev=temp;
				temp=temp.pre;
			}while(temp.pre!=tail) ;
			prev.pre=null; // tail to head
			tail.next=head;	
			head.pre=tail;
		}
		void deleteAtLast() {
			tail=tail.pre; // tail to head
			Nodec  temp = head;
			Nodec  prev=null;
			do {
				prev=temp;
				temp = temp.next;
			}while(temp.next!=head);
			prev.next=head; // null  -> head
			head.pre=prev; // prev == tail
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
			Nodec temp=head;
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
			Nodec temp = head;
			boolean flag = false;
			do{
				if(prevalue==temp.data) {
					temp.data=curvalue;
					flag=true;
				}   
				temp=temp.next;
			}while(temp!=head) ;
			if(!flag) {
				System.out.println(prevalue+" is not present");
			}
		}
		void  display() {
			Nodec temp=head;
			do {
				System.out.println(temp.data);
				temp=temp.next;
			}while(temp!=head);
			System.out.println();
		}
		void  revdisplay() {
			Nodec temp=tail;
			do {
				System.out.println(temp.data);
				temp=temp.pre;
			}while(temp!=tail);
			System.out.println();
		}
}
class CircularDoublyLinkedList {
	public static void main(String[] args) {
		Processc obj = new Processc();
		obj.insertAtBegin(20);
		obj.insertAtBegin(10);
		obj.insertAtBegin(5);
//		obj.display();	obj.revdisplay();
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