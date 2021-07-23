package com.tut.firstweb;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
    public static void main(String[] args) {
        // get and load
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factoy = cfg.buildSessionFactory();
        Session session = factoy.openSession();
        // Student st = (Student) session.get(Student.class, 10);
        // get ko id na milne pr bo null return krta hai
        //get ka data session ke catch me bhi store hota hai catch me data na mlne pr DB ko hit krega.
        Student sta = (Student) session.load(Student.class, 10);
        // load never return null ydi load me object nhi milta to exception de deta hai.
        //load lazy inisalixzation ye function call krne pr hi DB ko hit krega
        System.out.println(sta.getName());
        System.out.println(sta);
        
        // Adress
        //Address asa = (Address) session.get(Address.class, 10);
        Address as = (Address) session.load(Address.class, 1);
        System.out.println(as);
        //System.out.println(asa);
        System.out.println(as.getCity());
        session.close();
        factoy.close();
    }
}
