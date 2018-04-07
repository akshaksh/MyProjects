package ejbstatelessbean;

import javax.ejb.Stateless;

@Stateless(name="statelessbean",mappedName="ejb/statelessbean")
public class CalculationImpl implements Calcualtion {

	@Override
	public int add(int a, int b) {
		return a+b;
	}

}
