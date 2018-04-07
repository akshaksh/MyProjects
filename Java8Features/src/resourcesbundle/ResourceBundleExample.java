package resourcesbundle;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleExample {

	public static void main(String[] args) {
		Locale loc=new Locale("it","CH");
		ResourceBundle rb=ResourceBundle.getBundle("my",loc);
		//Locale.setDefault(loc);
		//System.out.println(DateFormat.getDateInstance(DateFormat.FULL,loc).format(Calendar.getInstance().getTime()));
		System.out.println(rb.getString("ajay"));
	}

}
