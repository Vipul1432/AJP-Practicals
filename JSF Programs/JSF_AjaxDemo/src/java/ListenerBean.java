import javax.faces.bean.ManagedBean;  

@ManagedBean  
public class ListenerBean {  

    String text;  

    public String getText() {  
        return text;  
    }  
    public void setText(String text) {  
    this.text = text;  
    }  
    public void ajaxEvent() {  
        text = text.toUpperCase();  
    }  
}  