package org.kodnest.DAOPATTERN;


	
	import java.util.List;
	public interface Employeedao {
	public List<Employee> getEmployees();
	public Employee getEmployeeById(int id);
	public String persistEmployee(Employee obj);
	public String updateEmployee(Employee obj);
	public String deleteEmployee(Employee obj);
	
}
