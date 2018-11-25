package com.jsp_programs;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class SubStringTag extends SimpleTagSupport {
	private String input;
	private int begin;
	private int end; 
	
	public void setInput(String input){   
		this.input = input;
	}
	
    public void setBegin(int begin){    
    	this.begin = begin;
    }
    
    public void setEnd(int end){
    	this.end = end;    
    }
    
    @Override
    public void doTag() throws IOException,JspException {
        JspWriter out = getJspContext().getOut();
        
        out.println(input.substring(begin,end));
    }
}
