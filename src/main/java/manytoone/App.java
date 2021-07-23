package manytoone;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        // SpringApplication.run(FirstappApplication.class, args);
        Configuration cfg = new Configuration();
        SessionFactory factoy = cfg.configure("hibernate.cfg.xml").buildSessionFactory();
        Answer a = new Answer();
        a.setAnswerId(443);
        a.setAnswer("Java is programming language.");

        Answer a1 = new Answer();
        a1.setAnswerId(44);
        a1.setAnswer("Java is Scriptiong language.");

        Answer a2 = new Answer();
        a2.setAnswerId(45);
        a2.setAnswer("Java is CSS UI.");
        Question question = new Question();
        question.setQid(22);
        question.setQuestion("What is java ?");
        a.setQuestion(question);
        a1.setQuestion(question);
        a2.setQuestion(question);
        //question.setAnswer(a);
        List<Answer> list =new ArrayList<Answer>();
        list.add(a);
        list.add(a1);
        list.add(a2);
        question.setAnswers(list);
        Session session = factoy.openSession();

        session.beginTransaction();
        session.save(question);
        session.save(a);
        session.save(a1);
        session.save(a2);
       /* Question q=(Question)session.get(Question.class, 22);
        System.out.println(q.getQuestion());
        for(Answer aa:q.getAnswers()){
            System.out.println(aa);}*/
        session.getTransaction().commit();
        session.close();
        factoy.close();
    }

}