package org.kodnest.ManyToOne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Product")
public class Product {
	@Id
	@Column(name="product_id")
	String product_id;
	@Column(name="product_name")
	String product_name;
	
	@ManyToOne
	@JoinColumn(name="category_id")
	Category category;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String product_id, String product_name, Category category) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.category=category;
		
	}

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
	

}
