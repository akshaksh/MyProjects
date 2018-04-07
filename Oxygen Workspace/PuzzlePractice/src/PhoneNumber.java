//Based on the Phone number print all combination of letters using loop
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class PhoneNumber {
	public static void main(String strs[]) {
		HashMap<Character,String> hmap=new HashMap<>();
		hmap.put('2',"abc");hmap.put('3',"def");hmap.put('4',"ghi");hmap.put('5',"jkl");
		hmap.put('6',"mno");hmap.put('7',"pqrs");hmap.put('8',"tuv");hmap.put('9',"wxyz");
		Scanner sc=new Scanner(System.in);
		String digits=sc.next();
		sc.close();
		Set<String> hst=new HashSet<>();
		Set<String> hst1=new HashSet<>();
		hst.add("");
		for(int i=0;i<digits.length();i++) {
			for(String strchk:hst) {
				for(int j=0;j<hmap.get(digits.charAt(i)).length();j++) {
					hst1.add(strchk+hmap.get(digits.charAt(i)).charAt(j));
					
				}
			}
			hst.clear();
			hst.addAll(hst1);
			hst1.clear();
		}
		Iterator<String> it=hst.iterator();
		System.out.println("Number of words: "+hst.size()+"  and Below is the list");
		while(it.hasNext()) {
			System.out.print(it.next()+",");
		}
		
		
	}
	
}
