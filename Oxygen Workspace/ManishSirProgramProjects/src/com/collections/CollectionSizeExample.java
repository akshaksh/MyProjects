package com.collections;
import java.util.*;
import java.util.Map.Entry;
public class CollectionSizeExample {
@SuppressWarnings("rawtypes")
static ArrayList al=new ArrayList();
@SuppressWarnings("rawtypes")
static Set s=new HashSet();
@SuppressWarnings("rawtypes")
static Map mp=new HashMap();
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String strs[]) {
		@SuppressWarnings("rawtypes")
		ArrayList al1=new ArrayList();
		al1.add("A");
		al1.add("B");
		al1.add("C");
		al1.add("D");
		al1.add("E");
		al1.add("F");
		al1.add("G");
		al.addAll(al1);
		System.out.println(al);
		System.out.println(al1);
		System.out.println(al.size());
		System.out.println(al1.size());
		al.remove(2);
		System.out.println("After Remove");
		
		System.out.println(al);
		System.out.println(al1);
		System.out.println(al.size());
		System.out.println(al1.size());
		
		//Iterator i=al1.iterator();
		ListIterator i=al1.listIterator();
		i.next();
		i.next();
		while(i.hasPrevious()) {
			System.out.println(i.previous());
			i.remove();
		}
		System.out.println(al1);
		s.add(null);
		s.add(null);
		s.add("A");
		s.add("");
		s.add("B");
		System.out.println(s);
		mp.put("", "A");
		mp.put(null, "B");
		mp.put("1", "A");
		mp.put("2", "C");
		mp.put("", "D");
		System.out.println(mp);
		Set me=mp.entrySet();
		Iterator io=me.iterator();
		while(io.hasNext()) {
			Map.Entry mpe=(Map.Entry) io.next();
			System.out.println("Key:"+mpe.getKey());
			System.out.println("Value:"+mpe.getValue());
		}
	}
}
