/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taruhibernate1;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author admin
 */
public class TaruHibernate1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Configuration con = new Configuration();
        con.configure("Resources/student.cfg.xml");
        
        SessionFactory sf = con.buildSessionFactory();
        sf.close();

    }
    
}
