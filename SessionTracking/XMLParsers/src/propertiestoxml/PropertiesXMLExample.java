package propertiestoxml;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesXMLExample
{
    public static void main(String[] args) throws IOException
    {
    	Properties props = new Properties();
    	props.setProperty("email.support", "donot-spam-me@nospam.com");
    	props.setProperty("email.support.1", "donot-spam-me@nospam.com");
    	props.setProperty("email.support.2", "donot-spam-me@nospam.com");
    	//where to store?
    	OutputStream os = new FileOutputStream("E:\\Luna IDE Workspaces\\XMLParsers\\src\\prop.xml");

    	//store the properties detail into a pre-defined XML file
    	props.storeToXML(os, "Support Email","UTF-8");
    	System.out.println("Done");
    	
    	//Now vice-versa
    	InputStream is = new FileInputStream("E:\\Luna IDE Workspaces\\XMLParsers\\src\\prop.xml");
    	//load the xml file into properties format
    	props.loadFromXML(is);
    	String email = props.getProperty("email.support.1");
    	System.out.println(email);
    }
}
