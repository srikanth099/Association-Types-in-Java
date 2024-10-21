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
@Table(name="mikl_product_info")
public class MilkProduct implements Serializable{
	
	@Id
	@GenericGenerator(name = "auto_gen" , strategy = "increment")
	@GeneratedValue(generator = "auto_gen")
	@Column(name="p_id")
	private long id;
	
	@Column(name="product_name")
	private String brand;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="brand_product")
	private List<MilkProduct> product;

	private List<MilkBrand> brands;
	
	

//	public MilkProduct(String brand, List<MilkProduct> product) {
//		super();
//		this.brand = brand;
//		this.product = product;
//	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public List<MilkBrand> getBrands() {
		return brands;
	}

	public void setBrands(List<MilkBrand> brands) {
		this.brands = brands;
	}

//	public List<MilkProduct> getProduct() {
//		return product;
//	}
//
//	public void setProduct(List<MilkProduct> product) {
//		this.product = product;
//	}

	@Override
	public String toString() {
		return "MilkProduct [brand=" + brand + ", product=" + product + "]";
	}

	
	
	
	
	
	

}
