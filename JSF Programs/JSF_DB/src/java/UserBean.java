/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.PreparedStatement;  
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * Database name : MEFGI
 * 
 * 
 * create table users(uid int primary key, name varchar(20), email varchar(20));
 */
@ManagedBean
@RequestScoped
public class UserBean {

    /**
     * Creates a new instance of UserBean
     */
    public UserBean() {
    }
String userName;  
String email;  
public String getUserName() {  
return userName;  
}  
public void setUserName(String userName) {  
this.userName = userName;  
}  
public String getEmail() {  
return email;  
}  
public void setEmail(String email) {  
this.email = email;  
}  

public boolean save(){  
int result = 0;  
try{  
Class.forName("com.mysql.jdbc.Driver");     
Connection con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/mefgi","root",""); 
PreparedStatement stmt = con.prepareStatement("insert into users(name,email) values(?,?)");  
stmt.setString(1, this.getUserName());  
stmt.setString(2, this.getEmail());  
result = stmt.executeUpdate();  
}
catch(Exception e){  
System.out.println(e);  
}  
if(result == 1){  
return true;  
}else return false;  
}  
  
public String submit(){  
if(this.save()){  
return "response.xhtml";  
}else return "index.xhtml";  
}     
}
