package onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        // SpringApplication.run(FirstappApplication.class, args);
        Configuration cfg = new Configuration();
        SessionFactory factoy = cfg.configure("hibernate.cfg.xml").buildSessionFactory();
        Answers a = new Answers();
        a.setAnswerId(344);
        a.setAnswer("python is programming language.");
        Questions question = new Questions();
        question.setQid(122);
        question.setQuestion("What is python ?");
        a.setQuestion(question);
        question.setAnswer(a);
        Session session = factoy.openSession();

        session.beginTransaction();
        session.save(a);
        session.save(question);
        session.getTransaction().commit();
        session.close();
        factoy.close();
    }

}
