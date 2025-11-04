package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Hashmap {


	public static boolean containsDuplicate(int arr[]) {
		Map<Integer, Integer> hm = new HashMap<>();
		hm.put(1, 1);
		hm.put(2, 20);
		hm.put(3, 30);
		hm.replace(3, null);
		hm.put(2, 222);
		hm.remove(3);
		System.out.println(hm.get(1));
		System.out.println(hm.get(2));
		System.out.println(hm.size());

		
		for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
			System.out.print(entry.getKey());
			System.out.println(entry.getValue());
			
		}
		Iterator <Entry <Integer, Integer>>it=hm.entrySet().iterator();
		while(it.hasNext())
		{
			Entry<Integer,Integer> nx=it.next();
			System.out.print(nx.getKey());
			System.out.println(nx.getValue());
			
		}
//		return false;
		for(int i: hm.keySet())
		{
			if(hm.containsKey(i)&&hm.get(i)>=1)return true;
			hm.put(i,hm.getOrDefault(arr, 0));
			System.out.println(hm.containsValue(i));
		}
	
			
		for (int num : hm.keySet()) {
			if (hm.containsKey(num) && hm.get(num) >= 1)
				return true;
		hm.put(num, hm.getOrDefault(num, 0) + 1);
		}
		return false;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 1, 4 };
		System.out.println(containsDuplicate(arr)); 
	}
}
