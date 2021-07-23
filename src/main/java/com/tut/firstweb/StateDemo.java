package com.tut.firstweb;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StateDemo {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory f = cfg.buildSessionFactory();
       //Student Object
       Student student=new Student();
       student.setId(34);
       student.setName("Aman");
       student.setCerti(new Certificate("Java Hibernate course","2months"));
       //student : Transient
       Session s=f.openSession();
       Transaction t=s.beginTransaction();
       s.save(student);//Student object ab persistent state me a gya kyoki session,db ke sath
       student.setName("Raj");//update
       t.commit();
       s.close();//Student : Detech kr diya jisse session close ho gya
       student.setName("Divanshu");
        f.close();
    }
}
