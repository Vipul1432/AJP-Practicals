package tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;


public class Example extends TagSupport{
    @Override
    public int doStartTag() throws JspException {
        JspWriter out = pageContext.getOut();
         try{
             out.println("<h1>Example of custom tag.</h1>");
         }
         catch(Exception e){
             e.printStackTrace();
         }
         return SKIP_BODY;
    }    
}
