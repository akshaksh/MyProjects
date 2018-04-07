import java.util.StringJoiner;


public class StringJoinerExample {

	public static void main(String[] args) {
		 //StringJoiner joinNames = new StringJoiner(","); // passing comma(,) as delimiter   
		 StringJoiner joinNames = new StringJoiner(",","[","]"); // with Prefix and suffix
		 StringJoiner joinNames1 = new StringJoiner(":","[","]"); //Going to join two StringJoiner
	        // Adding values to StringJoiner  
	        joinNames.add("Rahul");joinNames1.add("Rahul_1");  
	        joinNames.add("Raju");joinNames1.add("Raju_1"); 
	        joinNames.add("Peter");joinNames1.add("Peter_1");  
	        joinNames.add("Raheem");joinNames1.add("Raheem_1");  
	        joinNames.merge(joinNames1); //Merging two StringJoiner class
	        System.out.println(joinNames.length());//Number of characters of all string
	        System.out.println(joinNames);  

	}

}
