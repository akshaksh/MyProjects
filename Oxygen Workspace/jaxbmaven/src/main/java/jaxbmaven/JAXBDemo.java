package jaxbmaven;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.ajay.patient.Patient;

public class JAXBDemo {

	public static void main(String[] args) {
		try {
			//To which we want to Marshal(Means conversion from Java Object to XML)
			JAXBContext context= JAXBContext.newInstance(Patient.class);
			
			//Creating Marshaling Object using context object method;
			Marshaller marsh=context.createMarshaller();
			
			//Now we need object of that class which we want to marshelled
			Patient pat=new Patient();
			pat.setId(1);
			pat.setName("Rkj");
			
			//now we use Marshal class method to on which stream i need to create output
			
			StringWriter writer = new StringWriter();
			marsh.marshal(pat, writer);
			
			//Now printing the content of the Writer
			System.out.println(writer.toString());
			
			//Here it will generate xml with all the set properties and optional
			/**
			 * <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
			 * 		<patient id="1" xmlns="http://www.ajay.com/Patient">
			 * 			<name>Rkj</name>
			 * 			<age>0</age> Optional
			 * 		</patient>
			 */

/*****************************UNMARSHALLING******************************/
			//First creating Unmarshaler Object like Marshaler 
			Unmarshaller unmarsh=context.createUnmarshaller();

			//now Unmarshal the XML into Java Object using unmarshal method which takes 
			//object of StringReader class with String as parameter of 
			//constructor and return That class Object which into which we are marshalling 
			//e.g. here Patient
			Patient ummarspat=(Patient)unmarsh.unmarshal(new StringReader(writer.toString()));
			
			//Now check value is intact or not
			System.out.println(ummarspat.getName());
			System.out.println(ummarspat.getAge());
			System.out.println(ummarspat.getId());
//NOTE
//Above API used by Apache CXF engine etc. so normally we don't use it directly
			
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
