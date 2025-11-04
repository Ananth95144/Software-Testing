package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Hashsetpro {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>(); // add(), addAll(), remove(), toArray()
		LinkedList<String> ll = new LinkedList<String>();
		ArrayList<String> al = new ArrayList<String>();
		ll.add("set");
		ll.add("list");
		ll.add("tuple");
		al.add("var");
		al.add("let");
		al.add("const");
		al.add("list");
//		System.out.println(ll);
//		System.out.println(al);
		ll.addAll(al);
		hs.addAll(ll);
//		System.out.println(al.isEmpty()==false);
//		System.out.println(hs);
		Iterator<String> i = hs.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
//		System.out.println(ll.indexOf("var"));
//		String arr[]= new String [6];
//		ll.toArray(arr);
//		for (String prt : arr)
//		{
//			System.out.println(prt);
//		}
	}

}
