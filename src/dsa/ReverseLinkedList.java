//Reversing a LinkedList
package dsa;

class Node2{
   int data;
   Node2 next;
}
 
class processs extends Node2{
      Node2 head;
 
    void insertBegin(int data)
    {
      Node2 newnode=new Node2();
      newnode.data=data;
      newnode.next=null;
 
      if(head==null)
      head=newnode;
      else{
        newnode.next=head;
        head=newnode;
      }
    }
 
    void reverse()
    {
        Node2 temp=head, prev=null, next=null;
        while(temp!=null)
        {
            next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        head=prev;
    }
 
    void display(){
        Node2 temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
public class ReverseLinkedList extends processs{
    public static void main(String[] args) {
        ReverseLinkedList rev=new ReverseLinkedList();
        System.out.println("Inserting an elements in List");
        rev.insertBegin(3);
        rev.insertBegin(2);
        rev.insertBegin(1);
        rev.display();
        System.out.println("Reversing a linked list");
        rev.reverse();
        rev.display();
       
    }
}
 