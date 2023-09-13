package org.kodnest.dao;


import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;




public class App {
 
public static void main(String[] args) {
	  Scanner scan=new Scanner(System.in);
	  System.out.println("Enter the department");
	  String dept=scan.next();
	  		Configuration configuration = new Configuration();
	
	  		configuration.configure("hibernate.cfg.xml");
	  		//create service registry
	  		StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				 .applySettings(configuration.getProperties())
				 .build();
	  		//build session factory
	  		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	  		Session session=sessionFactory.openSession();
	  		session.beginTransaction();
	  		
	  		//org.hibernate.Query query= session.createQuery("from Employee ");
	  		Criteria criteria = session.createCriteria(Employee.class);
	  		criteria.add(Restrictions.eq("department", dept));
			List<Employee>  emplist=criteria.list();
	  		for(Employee employee : emplist)
	  		{
	  			System.out.println(employee);
	  		}
	  		
	  		session.getTransaction().commit();
	  		session.close();
  }
}
