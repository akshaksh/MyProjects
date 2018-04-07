package lambdaexpressions;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop {

	public static void main(String[] args) {
		int arr[]={4,5,6,7,8,9,12,3};
		List<String> list=new ArrayList<String>();  
        list.add("ankit");  
        list.add("mayank");  
        list.add("irfan");  
        list.add("jai");  
          
        list.forEach(  
            (n)->System.out.println(n)  
        );  

	}

}
