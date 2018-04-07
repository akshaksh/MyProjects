package com.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AccessingPrivateMethodsOutside {

	public static void main(String strs[]) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, NoSuchFieldException {
		Example ob= new Example();
		Method m=ob.getClass().getDeclaredMethod("display",String.class,Integer.class);
		m.setAccessible(true);
		m.invoke(ob,"jhfdvahjs",4);//But parameter will always takes in the for of wrapper class
		Field privateStringField = ob.getClass().getDeclaredField("ab");
		privateStringField.setAccessible(true);
		privateStringField.set(ob, 76);
		System.out.println(privateStringField.get(ob));
		
	}
}
