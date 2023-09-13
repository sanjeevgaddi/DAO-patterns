package org.kodnest.ManyToMany;

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
		 
		 Course c1=new Course("123","Math");
		 Course c2=new Course("456","Science");
		 
		 Student s1=new Student("1100","Ramesh");
		 Student s2=new Student("110","Suresh");
		 
		 s1.addcourse(c1);
		 s2.addcourse(c2);
		 
		 session.persist(s1);
		 session.persist(s2);
		 session.persist(c1);
		 session.persist(c2);
		 
		 session.getTransaction().commit();
		 session.close();
    }
}
