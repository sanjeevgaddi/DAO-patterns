package org.kodnest.DAOPATTERN;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
public class EmployeeDaoImple implements Employeedao
{
	SessionFactory sf=null;
	public SessionFactory getSessionFactory()
	{
		if(sf==null)
		{
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties())
				.build();
		 sf = configuration.buildSessionFactory(serviceRegistry);
		 return sf;
		}
		return sf;
	}
	public List<Employee> getEmployees() {
		Session session=null;
		try {
		sf=getSessionFactory();
		 session=sf.openSession();
		session.beginTransaction();
		
		Criteria criteria =session.createCriteria(Employee.class);
		List<Employee> emplist=criteria.list();
		return emplist;
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		finally {
			session.close();
		}
	}
	public Employee getEmployeeById(int id) {
		Session session=null;
		try {
		sf=getSessionFactory();
		 session=sf.openSession();
		session.beginTransaction();
		Employee e1=(Employee) session.get(Employee.class, id);
		
			return e1;
			
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		finally {
			session.close();
		}
	}
	public String persistEmployee(Employee obj) {
		Session session=null;
		try {
		sf=getSessionFactory();
		 session=sf.openSession();
		session.beginTransaction();
		session.persist(obj);
		session.getTransaction().commit();
		return "Object Saved In DB";
		}
		catch (Exception e) {
			e.printStackTrace();
			return "Some issue in saving object";
		}
		finally {
			session.close();
		}
	}
	public String updateEmployee(Employee obj) {
		Session session=null;
		try {
		sf=getSessionFactory();
		 session=sf.openSession();
		session.beginTransaction();
		session.update(obj);
		session.getTransaction().commit();
		return "Update Success";
		}
		catch (Exception e) {
			e.printStackTrace();
			return "Issue in Updating please retry...";
		}
		finally {
			session.close();
		}
	}
	public String deleteEmployee(Employee obj) {
		Session session=null;
		try {
		sf=getSessionFactory();
		 session=sf.openSession();
		session.beginTransaction();
		session.delete(obj);
		session.getTransaction().commit();
		return "Deletion success";
		}
		catch (Exception e) {
			e.printStackTrace();
			return "Deletion Failure";
		}
		finally {
			session.close();
		}
	}
	
}

