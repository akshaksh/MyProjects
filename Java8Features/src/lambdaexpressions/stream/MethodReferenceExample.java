package lambdaexpressions.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
class Products{  
    int id;  
    String name;  
    float price;  
      
    public Products(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
          
    public int getId() {  
        return id;  
    }  
    public String getName() {  
        return name;  
    }  
    public float getPrice() {  
        return price;  
    }  
}  
  
public class MethodReferenceExample {

	public static void main(String[] args) {
		List<Products> productsList = new ArrayList<Products>();  
        
        //Adding Products  
        productsList.add(new Products(1,"HP Laptop",25000f));  
        productsList.add(new Products(2,"Dell Laptop",30000f));  
        productsList.add(new Products(3,"Lenevo Laptop",28000f));  
        productsList.add(new Products(4,"Sony Laptop",28000f));  
        productsList.add(new Products(5,"Apple Laptop",90000f));  
          
        List<Float> productPriceList =   
                productsList.stream()  
                            .filter(p -> p.price > 30000) // filtering data  
                            .map(Products::getPrice)         // fetching price by referring getPrice method  
                            .collect(Collectors.toList());  // collecting as list  
        System.out.println(productPriceList);  

	}

}
