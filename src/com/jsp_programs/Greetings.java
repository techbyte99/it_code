package com.jsp_programs;

import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.Date;

public class Greetings extends SimpleTagSupport {
	
   @SuppressWarnings("deprecation")
   @Override
   public void doTag() throws JspException, IOException {
	   
      JspWriter out = getJspContext().getOut();
      Date date = new Date();
      
	int hour = date.getHours();      
	
	if(hour < 12)
      out.println("Good Morning");
	else if(hour < 17)
      out.println("Good Afternoon");
	else
      out.println("Good Evening");      
   }
}
