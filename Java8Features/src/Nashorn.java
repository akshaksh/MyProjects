import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


public class Nashorn {

	public static void main(String[] args) throws FileNotFoundException, ScriptException {
		// Creating script engine  
        ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");  
        // Reading Nashorn file  
        ee.eval(new FileReader("C:\\Users\\Ajay_Kushwaha\\Desktop\\hello.js"));
        ee.eval("print('Hello Nashorn');");  

	}

}
