package com.tut.firstweb;

import java.util.Arrays;
import java.util.List;

import org.hibernate.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HQLEx {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        SessionFactory factoy = cfg.configure("hibernate.cfg.xml").buildSessionFactory();
        Session s = factoy.openSession();
        // HQL Syntax
        // Query
        /*String query = "from Student  where Name=:x and durasation=:n";// select query.//work on class name
        Query q = s.createQuery(query);
        q.setParameter("x", "Raj");//Dynamic value pass
        q.setParameter("n", "2months");
        // single(unique) or multiple result;
        List<Student> lists = q.list();
        for (Student ss : lists) {
            System.out.println(ss.getName() + ss.getCerti());
        }*/
        System.out.println("---------------------");
        Transaction tx=s.beginTransaction();
        //Delete query
       /* Query q2=s.createQuery("delete from Student where Name=:n");
        q2.setParameter("n", "Raj");
        int r=q2.executeUpdate();
        System.out.println("Deleted : "+r);*/
        //update Query
        /*Query q3=s.createQuery("update Student set Name=:n where durasation=:d");
        q3.setParameter("n", "aman gupta");
        q3.setParameter("d", "3");
        int r=q3.executeUpdate();
        System.out.println("UPdated :"+r);*/
        tx.commit();
        Query q3=s.createQuery("select q.question, q.qid ,a.answer from Question as q INNER JOIN  q.answers as a ");
        List<Object []> list=q3.getResultList();
        for(Object[] arr:list){
            System.out.println(Arrays.toString(arr));
        }
        s.close();
        factoy.close();
    }
}
