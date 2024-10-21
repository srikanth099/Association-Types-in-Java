package org.Friday.assosiationtype.manytomany;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="milk_brand_info")
public class MilkBrand implements Serializable{
	
	@Id
	@GenericGenerator(name = "auto_gen" , strategy = "increment")
	@GeneratedValue(generator = "auto_gen")
	@Column(name="b_id")
	private long id;
	
	@Column(name="brand_name")
	private String name;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="brand_product")
	private List<MilkBrand> brands;

	private List<MilkProduct> product;

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
//
//	public List<MilkBrand> getBrands() {
//		return brands;
//	}
//
//	public void setBrands(List<MilkBrand> brands) {
//		this.brands = brands;
//	}
	
	public List<MilkProduct> getProduct() {
		return product;
	}

	public void setProduct(List<MilkProduct> product) {
		this.product = product;
	}
	@Override
	public String toString() {
		return "MilkBrand [name=" + name + ", brands=" + brands + "]";
	}

	
	
	

}
