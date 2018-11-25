package com.jsp_programs;

import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.*;
import java.io.*;

public class HelloTag extends SimpleTagSupport {
	
	String name; 
	
    public void setName(String name) {
        this.name=name;
    }
    
    @Override
    public void doTag() throws JspException,IOException {
        JspWriter out = getJspContext().getOut();
        out.println("\nHello "+ name);
    }  
}
