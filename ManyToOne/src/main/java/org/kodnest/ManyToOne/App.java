package org.kodnest.ManyToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	//create the Hibernate configuration
		 Configuration configuration = new Configuration();
		 //Congigure hibernate.cfg.xml
		 configuration.configure("hibernate.cfg.xml");
		 //create service registry
		 StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				 .applySettings(configuration.getProperties())
				 .build();
		 //build session factory
		 SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		 Session session=sessionFactory.openSession();
		 session.beginTransaction();
		 Category category1=new  Category("456","Books");
		 Category category2=new  Category("789","Car");
		 
		 Product p1=new Product("110","Science",category1);
		 Product p2=new Product("250","Maths",category1);
		 Product p3=new Product("101","Marcedes Benz",category2);
		 Product p4=new Product("202","BMW",category2);
		 
		 category1.addproduct(p1);
		 category1.addproduct(p2);
		 category2.addproduct(p3);
		 category2.addproduct(p4);
		 
		 session.persist(category1);
		 session.persist(category2);
		 
		 session.getTransaction().commit();
		 session.close();
    }
}
