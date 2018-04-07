package ejbstatelessbean;

import javax.ejb.Remote;

@Remote
public interface Calcualtion {
int add(int a, int b);
}
