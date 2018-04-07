package demo;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		Map<Integer,String> mp=new HashMap<Integer,String>();
		mp.put(1, "A");
		mp.put(null, "B");
		mp.put(2, "c");
		System.out.println(mp.keySet());
		System.out.println(mp.values());
	}

}
