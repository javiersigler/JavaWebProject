package com.hibernate.costumer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import com.hibernate.employee.Employee;

public class TestCustomer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AnnotationConfiguration config = new AnnotationConfiguration();
		config.addAnnotatedClass(Customer.class);
		config.configure("hibernate.cfg.xml");
		
		new SchemaExport(config).create(true, true);
		
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		
		Customer sam = new Customer();
		sam.setName("Samuel");
		sam.setAdress("555 Five Avenue st, DC");
		sam.setCreditScore(10);
		sam.setRewardPoints(550);
		
		session.save(sam);

		session.getTransaction().commit();
		
	}

}
