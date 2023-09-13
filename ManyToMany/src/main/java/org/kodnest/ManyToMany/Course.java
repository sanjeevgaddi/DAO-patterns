package org.kodnest.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Course")
public class Course {
	@Id
	@Column(name="cid")
	String cid;
	@Column(name="cname")
	String cname;
	
	@ManyToMany(mappedBy = "courselist",cascade=CascadeType.ALL)
	List<Student> studentlist=new ArrayList<Student>();
	public Course() {
		// TODO Auto-generated constructor stub
	}

	public Course(String cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public List<Student> getStudentlist() {
		return studentlist;
	}

	public void setStudentlist(List<Student> studentlist) {
		this.studentlist = studentlist;
	}
	

	
}
