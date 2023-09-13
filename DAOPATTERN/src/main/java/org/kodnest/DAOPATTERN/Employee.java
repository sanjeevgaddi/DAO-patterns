package org.kodnest.DAOPATTERN;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name="employee")
	public class Employee {
		@Id
		@Column(name="id")
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		int id;
		
		@Column(name="name")
		String name;
		
		@Column(name="department")
		String department;
		
		public Employee() {
			// TODO Auto-generated constructor stub
		}

		public Employee(String name, String department) {
			super();
			this.name = name;
			this.department = department;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDepartment() {
			return department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", department=" + department + "]";
		}


}
