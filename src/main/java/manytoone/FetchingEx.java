package manytoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FetchingEx {
    public static void main(String[] args){
    Configuration cfg = new Configuration();
    SessionFactory factoy = cfg.configure("hibernate.cfg.xml").buildSessionFactory();
Session s=factoy.openSession();
Transaction tx=s.beginTransaction();
Question q=(Question)s.get(Question.class, 22);
System.out.println(q.getQuestion());
System.out.println(q.getAnswers().size());

for(Answer aa:q.getAnswers()){
    System.out.println(aa.getAnswer());
}
tx.commit();
s.close();
factoy.close();
}}
