/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Date;  
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author admin
 */
@ManagedBean
@RequestScoped
public class User {

     public User() {
    }
    String name;  
    Date dob;  
public String getName() {  
return name;  
}  
public void setName(String name) {  
this.name = name;  
}  
public Date getDob() {  
return dob;  
}  
public void setDob(Date dob) {  
this.dob = dob;  
}  
    
}
