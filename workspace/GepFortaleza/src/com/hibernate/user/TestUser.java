package com.hibernate.user;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class TestUser {

	public static void main(String[] args){
		AnnotationConfiguration config = new AnnotationConfiguration();
		config.addAnnotatedClass(Users.class);
		config.configure("hibernate.cfg.xml");
		
		new SchemaExport(config).create(true, true);
		
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		
		Users sam = new Users();
		sam.setUserKey(new UserKey(1, "samuelteixeiras@mail.com"));
		sam.setName("Samuel");
		
		session.save(sam);
		
		// Save the object in database
		session.getTransaction().commit();
//		session.close();
		
		
		
		
	}
}

