package com.tut.firstweb;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class Emdemo {
    public static void main(String[] args){
        Configuration cfg = new Configuration();
		SessionFactory factoy = cfg.configure("hibernate.cfg.xml").buildSessionFactory();
    Student s=new Student();
    s.setId(4);
    s.setName("aman ji");
    Certificate c=new Certificate();
    c.setCourse("BCA -6 Sem");
    c.setDurasation("3");
    s.setCerti(c);
    Session session=factoy.openSession();
    session.beginTransaction();
    session.save(s);
    session.getTransaction().commit();//
    session.close();
    }
}
