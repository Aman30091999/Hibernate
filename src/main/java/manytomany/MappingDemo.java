package manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class MappingDemo {
    public static void main(String[] args) {
        // SpringApplication.run(FirstappApplication.class, args);
        Configuration cfg = new Configuration();
        SessionFactory factoy = cfg.configure("hibernate.cfg.xml").buildSessionFactory();
        Emp e=new Emp();
        e.setEid(134);
        e.setName("Aman gupta1");
        Emp e1=new Emp();
        e1.setEid(351);
        e1.setName("Radij");

        Project p1=new Project();
        p1.setPid(132);
        p1.setProjectname("Notepads");
        Project p2=new Project();
        p2.setPid(133);
        p2.setProjectname("Notepad-Gamng");

        List<Emp>l= new ArrayList<Emp>();
        l.add(e);
         l.add(e1);
        List<Project>l1= new ArrayList<Project>();
         l1.add(p1);
         l1.add(p2);
         //
         e.setProjects(l1);
         p2.setEmps(l);

         Session s=factoy.openSession();
         Transaction tx=s.beginTransaction();
         s.save(e);
         s.save(e1);
         s.save(p1);
         s.save(p2);
         tx.commit();
         s.close();
       factoy.close();
    }
}