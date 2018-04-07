package ejb.statelessbean;

import javax.ejb.Stateless;

@Stateless(mappedName="stl")  
public class CalculationImpl implements Calculation {

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

}
