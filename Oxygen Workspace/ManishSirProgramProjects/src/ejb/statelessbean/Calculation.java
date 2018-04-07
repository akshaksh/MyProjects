package ejb.statelessbean;
import  javax.ejb.Remote;
@Remote
public interface Calculation{
	
	int add(int a,int b);

}
