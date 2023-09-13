package org.kodnest.hibernatedelete;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name="Employee")
public class EmployeeDelete{
	@Column(name="id")
	@Id
	String id;
	@Column(name="name")
	String name;
	@Column(name="salary")
	String salary;
	@Column(name="gender")
	String gender;
	@Column(name="age")
	String age;
	
	public EmployeeDelete() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeDelete(String id, String name, String salary, String gender, String age) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.gender = gender;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+" "+name+" "+salary+" "+gender+" "+age;
		
	}

}

