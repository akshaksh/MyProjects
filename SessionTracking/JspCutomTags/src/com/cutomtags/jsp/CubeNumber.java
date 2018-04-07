package com.cutomtags.jsp;

import javax.servlet.jsp.JspException;  
import javax.servlet.jsp.JspWriter;  
import javax.servlet.jsp.tagext.TagSupport;  
  
public class CubeNumber extends TagSupport{  
/**
	 * 
	 */
	private static final long serialVersionUID = -4187678990661051009L;
private int number;  
private int power;
private static int counter;  
private static int result=1;  
public void setNumber(int number) {  
    this.number = number;  
}  
public void setPower(int power) {  
    this.power = power;  
} 
public int doStartTag() throws JspException {  
   /* JspWriter out=pageContext.getOut();  
    try{  
        out.print("Cube of number"+number+": "+(number*number*number)+"<br>");  
    }catch(Exception e){e.printStackTrace();}  
   */
	System.out.println("doStartTag");
    return EVAL_BODY_INCLUDE;  
}  
public int doAfterBody() throws JspException{  
	System.out.println("doAfterBody");
    counter++;   
    result=result*number;   
    if (counter==power)   
      return SKIP_BODY;   
    else   
      return EVAL_BODY_AGAIN;   
  } 
public int doEndTag() throws JspException {
	System.out.println("doEndTag");
    JspWriter out=pageContext.getOut();  
    try{  
        out.print(number+" power of"+power+":  "+result);  
    }catch(Exception e){e.printStackTrace();}  
      
    return EVAL_PAGE;  
}  
}  