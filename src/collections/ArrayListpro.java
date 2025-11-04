package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListpro {

	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		al.add("Apple");
		al.add("banana");
		al.add("grapes");
		al.add("pineapple");
		al.add("guva");
		al.add(5, "Apple");
		List<String> l = new ArrayList<String>();
		l.addAll(al);
//		System.out.println(al);
//		System.out.println(al.contains("Apple"));
//		System.out.println(al.indexOf("Apple"));
//		System.out.println(al.lastIndexOf("Apple"));
//		al.set(4, "dragonfruit");
//		System.out.println(al.get(4));
//		System.out.println(al.size());
//		al.remove(5);
//		System.out.println(al);
//		String str = al.toString();// String immutable so can't edit a
//		System.out.println(str);//
//		for (String p : al) {
//			System.out.println(p);
//		}
////		al.clear();
//		ArrayList<String> list1 = new ArrayList<String>(10);
//		System.out.println(list1.size());
//		List<String> list2 = new ArrayList<>(al);
//		System.out.println(al);
//		System.out.println(list1);
//		System.out.println(list2);
		Iterator <String> i = l.iterator();
		while(i.hasNext())
		{
//			if(i.next()=="guva")
			System.out.println(i.next());
		}
		
		
	}
}
