/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.validation.constraints.NotNull;  

/**
 *
 * @author heman
 */
@ManagedBean
@RequestScoped
public class helloworld {

  private String uname;
  private String lname;
  private String mobno;
  private String password;
  private String address;
  private int age;
  
  @NotNull(message = "You must choose the gender...can't be null")  
  private String gender;



	public helloworld(){
		System.out.println("Started");
	}
	
	public String getMobno(){
		return mobno;
	}

	public void setMobno(String mobno){
		this.mobno=mobno;
       	}	

	public String getUname(){
		return uname;
	}

	public void setUname(String uname){
		this.uname=uname;
	}
        public String getLname(){
		return lname;
	}

	public void setLname(String lname){
		this.lname=lname;
	}
        public String getPassword(){
		return password;
	}

	public void setPassword(String password){
		this.password=password;
	}
        public String getAddress(){
		return address;
	}

	public void setAddress(String address){
		this.address=address;
	}
        public String getGender(){
		return gender;
	}
	public void setGender(String gender){
		this.gender=gender;
	}
        public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age=age;
	}
}
