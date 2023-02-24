/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.util.Iterator;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author admin
 */
public class ManageEmployee {
    private static SessionFactory factory; 
   public static void main(String[] args) {
      
      try {
         factory = new AnnotationConfiguration().
                   configure().
                   addPackage("com"). //add package if used.
                   addAnnotatedClass(Employee.class).
                   buildSessionFactory();
      } catch (Throwable ex) { 
         System.err.println("Failed to create sessionFactory object." + ex);
         throw new ExceptionInInitializerError(ex); 
      }
      
      ManageEmployee ME = new ManageEmployee();

      /* Add few employee records in database */
      Integer empID1 = ME.addEmployee("Taru", "Bloch", 1000);
      Integer empID2 = ME.addEmployee("Mery", "KP", 5000);
      Integer empID3 = ME.addEmployee("Susmita", "Mandal", 10000);

      /* List down all the employees */
      ME.listEmployees();

      /* Update employee's records */
   //   ME.updateEmployee(empID1, 5000);

      /* Delete an employee from the database */
   //   ME.deleteEmployee(empID2);

      /* List down new list of the employees */
    //  ME.listEmployees();
   }
   
   /* Method to CREATE an employee in the database */
   public Integer addEmployee(String fname, String lname, int salary){
      Session session = factory.openSession();
      Transaction tx = null;
      Integer employeeID = null;
      
      try {
         tx = session.beginTransaction();
         Employee employee = new Employee();
         employee.setFirstName(fname);
         employee.setLastName(lname);
         employee.setSalary(salary);
         employeeID = (Integer) session.save(employee); 
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) {
              tx.rollback();
          }
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
      return employeeID;
   }
   
   /* Method to  READ all the employees */
   public void listEmployees( ){
      Session session = factory.openSession();
      Transaction tx = null;
      
      try {
         tx = session.beginTransaction();
         List employees = session.createQuery("FROM Employee").list(); 
         for (Iterator iterator = employees.iterator(); iterator.hasNext();){
            Employee employee = (Employee) iterator.next(); 
            System.out.print("First Name: " + employee.getFirstName()); 
            System.out.print("  Last Name: " + employee.getLastName()); 
            System.out.println("  Salary: " + employee.getSalary()); 
         }
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) {
              tx.rollback();
          }
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
   }
   
   }
    

