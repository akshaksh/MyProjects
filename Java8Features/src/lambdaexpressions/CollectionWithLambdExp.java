package lambdaexpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class CollectionWithLambdExp {

	public static void main(String[] args) {
		 List<Product> list=new ArrayList<Product>();  
         
	        //Adding Products  
	        list.add(new Product(1,"HP Laptop",25000f));  
	        list.add(new Product(3,"Keyboard",300f));  
	        list.add(new Product(2,"Dell Mouse",150f));  
	          
	        System.out.println("Sorting on the basis of name...");  
	  
	        // implementing lambda expression  
	        Collections.sort(list,(p1,p2)->{  
	        return p2.name.compareTo(p1.name);  
	        });  
	        for(Product p:list){  
	            System.out.println(p.id+" "+p.name+" "+p.price);  
	        }
     	     // using lambda to filter data
	        // Each record of the list will consider the first param(p)
	        Stream<Product> filtered_data = list.stream().filter(p -> p.price > 150);  
	          
	        // using lambda to iterate through collection  
	        filtered_data.forEach(
	                product -> System.out.println(product.name+": "+product.price)
	        );  
	        //With normal string list with lambda
	        List<String> al=new ArrayList<String>();
	        al.add("abc");al.add("abcd");al.add("abcde");
	        al.forEach(n->System.out.println(n));
	        
	        //With normal string list with lambda expression with Comparator 
	        List<String> bl=new ArrayList<String>();
	        bl.add("abc");bl.add("abcd");bl.add("abcde");
	        Collections.sort(bl,(a1,a2)->{return a2.compareTo(a1);});
	        bl.forEach(n->System.out.println(n));


	}

}
class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        super();  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  

