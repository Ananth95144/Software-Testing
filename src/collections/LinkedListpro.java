package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListpro {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("tomato");
		ll.add("greenbean");
		ll.add("carrot");
		ll.add("beetroot");
		ll.add(4,"radish");
		ll.addFirst("Potato");
		ll.addLast("eggplant");
		System.out.println(ll);
		ll.set(ll.size()-1, "lady'sfinger");
		System.out.println(ll.get(ll.size()-1));
		System.out.println(ll);
		System.out.println(ll.peek());
		System.out.println(ll.peekFirst());
		System.out.println(ll.peekLast());
		System.out.println(ll);
		System.out.println(ll.poll());
		System.out.println(ll);
		System.out.println(ll.pollFirst());
		System.out.println(ll);
		System.out.println(ll.pollLast());
		System.out.println(ll);
		ll.remove("radish");
		System.out.println(ll);
		ll.remove(1);
		System.out.println(ll);
		ll.removeFirst();
		System.out.println(ll);
//		ll.removeAll(ll);
		System.out.println(ll);
//		ll.clear();
		System.out.println(ll);
		List<String> al = new ArrayList<String>();
		al.add("Apple");
		al.add("banana");
		ll.addAll(al);
		System.out.println(ll);
		System.out.println();
		Iterator <String> it=ll.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
