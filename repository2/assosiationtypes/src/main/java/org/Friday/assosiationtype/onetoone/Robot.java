package org.Friday.assosiationtype.onetoone;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "robots")
public class Robot implements Serializable {
	@Id
	@GenericGenerator(name = "auto_gen", strategy = "increment")
	@GeneratedValue(generator = "auto_gen")
	@Column(name = "att_key")
	private long altKey;

	@Column(name = "metal_type")
	private String metal;

	@Column(name = "perpose_of_robot")
	private String perposeOfRobot;

	@Column(name = "nodddel_name")
	private String modelName;

	@Column(name = "product_name")
	private String productName;

	public long getAltKey() {
		return altKey;
	}

	public void setAltKey(long altKey) {
		this.altKey = altKey;
	}

	public String getMetal() {
		return metal;
	}

	public void setMetal(String metal) {
		this.metal = metal;
	}

	public String getPerposeOfRobot() {
		return perposeOfRobot;
	}

	public void setPerposeOfRobot(String perposeOfRobot) {
		this.perposeOfRobot = perposeOfRobot;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	
}
