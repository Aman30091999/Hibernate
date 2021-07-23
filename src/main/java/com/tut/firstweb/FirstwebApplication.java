package com.tut.firstweb;

import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstwebApplication {
	public static void main(String[] args) throws IOException {
		
		// SpringApplication.run(FirstwebApplication.class, args);
		System.out.println("Project Startd..");
		// ye connection hai.
		// SessionFactory interface hai.
		Configuration cfg = new Configuration();
		SessionFactory factoy = cfg.configure("hibernate.cfg.xml").buildSessionFactory();
		Student s = new Student();
		s.setId(10);
		s.setName("aman Gupta");
		
		System.out.println(s);
		// Address Class Object.
		Address ad = new Address();
		ad.setStreet("Sector-126 Gali No.-8");
		ad.setCity("Noida");
		ad.setOpen(true);
		ad.setAddedDate(new Date());
		ad.setX(4567.87);
		
		// Session interface for hibernate
		Session session = factoy.openSession();// session return krega query
		// session start hoga
		session.beginTransaction();
		session.save(s);// object ko save krega
		session.save(ad);

		session.getTransaction().commit();//
		session.close();// session ko close krega
		// System.out.println(factoy);
		System.out.println(factoy.isClosed());
		System.out.println("Done...");
	}

}
