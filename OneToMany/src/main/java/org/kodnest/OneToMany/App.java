package org.kodnest.OneToMany;

import java.util.ArrayList;
import java.util.TreeSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import antlr.collections.List;
@SuppressWarnings("unused")
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
		 Department department=new Department("20","Training");
		 Department department2=new Department("30","Management");
		 
		 Employee e1=new Employee("8989","Ramesh");
		 Employee e2=new Employee("7878","suresh");
		 Employee e3=new Employee("1234","Ram");
		 Employee e4=new Employee("4321","Sham");
		 
		 department.addemployee(e1);
		 department.addemployee(e3);
		 department2.addemployee(e2);
		 department2.addemployee(e4);
		 
		 session.persist(department);
		 session.persist(department2);
		 session.getTransaction().commit();
		 session.close();
    }
}
