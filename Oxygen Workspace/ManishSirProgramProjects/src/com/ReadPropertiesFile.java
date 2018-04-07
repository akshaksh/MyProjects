package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

		public static void main(String strs[]) throws IOException {
			Properties prop=new Properties();
			FileInputStream fin=new FileInputStream("New.properties");
			prop.load(fin);
			System.out.println(prop.getProperty("name"));
			System.out.println(prop.getProperty("address"));
		}
}
