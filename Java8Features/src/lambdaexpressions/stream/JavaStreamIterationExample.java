package lambdaexpressions.stream;

import java.util.stream.Stream;

public class JavaStreamIterationExample {

	public static void main(String[] args) {
		Stream.iterate(1, element->element+1)  
        .filter(element->element%2==0)  
        .limit(5)  
        .forEach(System.out::println); 
		
	}

}
