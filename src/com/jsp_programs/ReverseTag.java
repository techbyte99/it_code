package com.jsp_programs;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class ReverseTag extends SimpleTagSupport {
	
	String input;
	
	public void setInput(String input) {
		this.input = input;
	}
	
	public void doTag() throws IOException,JspException {
		JspWriter out = getJspContext().getOut();
		
		StringBuilder s = new StringBuilder(input);
        s = s.reverse();
        
        input = s.toString();
        
        out.println(input);
	}
}
