package org.kodnest.OneToMany;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Department")
public class Department {
	
	@Id
	@Column(name="dept_id")
	String dept_id;
	@Column(name="dept_name")
	String dept_name;
	
	@OneToMany(mappedBy="department",cascade=CascadeType.ALL)
	List<Employee> emplist;
	
	public Department() {
		// TODO Auto-generated constructor stub
	}

	public Department(String dept_id, String dept_name) {
		super();
		this.dept_id = dept_id;
		this.dept_name = dept_name;
		emplist=new ArrayList<>();
	}

	public String getDept_id() {
		return dept_id;
	}

	public void setDept_id(String dept_id) {
		this.dept_id = dept_id;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	
	public void addemployee(Employee employee)
	{
		//Assign the current department
		employee.setDepartment(this);
		
		//Add the employee to list
		emplist.add(employee);
		
	}
	
	

}
