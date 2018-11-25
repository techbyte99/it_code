package com.jsp_programs;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class ChocoTag extends SimpleTagSupport {
	
	String texture; 
	
    public void setTexture(String texture) {
        this.texture=texture.toLowerCase();
    }

    @Override
    public void doTag() throws JspException,IOException {
    	
        JspWriter out = getJspContext().getOut();
        
        if(texture.equals("crunchy"))
            out.println("Munch KitKat");
        if(texture.equals("chewy"))
            out.println("FiveStar BarOne");
    } 
}
