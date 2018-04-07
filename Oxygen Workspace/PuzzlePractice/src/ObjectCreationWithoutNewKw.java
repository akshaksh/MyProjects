import java.io.ObjectInputStream;

public class ObjectCreationWithoutNewKw {

	int x=10;
	int y=20;
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, CloneNotSupportedException {
		
		//1st way using newInstance method
		ObjectCreationWithoutNewKw ob=(ObjectCreationWithoutNewKw)Class.forName("ObjectCreationWithoutNewKw").newInstance();
		System.out.println(ob.x);
		System.out.println(ob.y);
		
		//2nd way using loadClass() with newInstance method
		ObjectCreationWithoutNewKw ob1=(ObjectCreationWithoutNewKw)Class.forName("ObjectCreationWithoutNewKw").getClassLoader().loadClass("ObjectCreationWithoutNewKw").newInstance();
		System.out.println(ob1.x);
		System.out.println(ob1.y);
		
		//3rd way using Clone() method
		ObjectCreationWithoutNewKw ob2=new ObjectCreationWithoutNewKw();
		ObjectCreationWithoutNewKw ob3=(ObjectCreationWithoutNewKw)ob2.clone();
		
		//4th way using Serialization and Deserialization
		/*
		 *ObjectInputStream objStream = new ObjectInputStream(inputStream);
 		  NewClass obj = (NewClass ) inStream.readObject();
		 */
		//5th Way directly 
		ObjectCreationWithoutNewKw.class.newInstance();
		
		
	}

}
