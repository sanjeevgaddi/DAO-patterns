package org.kodnest.ManyToOne;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Category")
public class Category {
	@Id
	@Column(name="category_id")
	String category_id;
	@Column(name="category_name")
	String category_name;
	
	@OneToMany(mappedBy="category",cascade=CascadeType.ALL)
	List<Product> proList;
	
	public Category() {
		// TODO Auto-generated constructor stub
	}

	public Category(String category_id, String category_name) {
		super();
		this.category_id = category_id;
		this.category_name = category_name;
		proList=new ArrayList<>();
	}

	public String getCategory_id() {
		return category_id;
	}

	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}

	public String getCategory_name() {
		return category_name;
	}

	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	
	public List<Product> getProduct() {
		return proList;
	}
	 public void setProduct(List<Product> proList)
	    {
	        this.proList = proList;
	    }
	
	public void addproduct(Product product)
	{
		product.setCategory(this);
		proList.add(product);
	}

	
	

}
