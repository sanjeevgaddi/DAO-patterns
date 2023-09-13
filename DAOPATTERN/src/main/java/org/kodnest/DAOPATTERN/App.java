package org.kodnest.DAOPATTERN;

import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
    	EmployeeDaoImple ref=new EmployeeDaoImple();
    	List<Employee> emplist=ref.getEmployees();
    	for(Employee employee:emplist)
    	{
    		System.out.println(employee);
    	}
    	
    	Employee emp=ref.getEmployeeById(1);
    	System.out.println(emp);
    }
}
