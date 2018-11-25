package com.jsp_programs;

import java.io.IOException;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class TodayTag extends SimpleTagSupport {
	@Override
    public void doTag() throws IOException,JspException {
		JspWriter out = getJspContext().getOut();
		
		Date date = new Date();
		
		out.print(date.toString());
	}

}
