package org.kodnest.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	@Id
	@Column(name="sid")
	String sid;
	@Column(name="sname")
	String sname;
	
	@ManyToMany
	@JoinTable(
			name="StudentCourse",
			joinColumns= {@JoinColumn(name="studentid")},
			inverseJoinColumns= {@JoinColumn(name="courseid")}
			)
	List<Course> courselist=new ArrayList<Course>();
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}
	
	public void addcourse(Course course) {
		courselist.add(course);
		course.getStudentlist().add(this);
	}

}
