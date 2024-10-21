package org.Friday.assosiationtype.onetomany;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "customer_info")
public class Customer implements Serializable {

	@Id
	@GenericGenerator(name = "auto_gen", strategy = "increment")
	@GeneratedValue(generator = "auto_gen")
	@Column(name = "alt_key")
	private long altKey;

	@Column(name = "name")
	private String name;

	@Column(name = "address")
	private String address;

	@Column(name = "contact")
	private String contact;

	@Column(name = "dateof_birth")
	private Date dateofBirth;

	@Column(name = "user_id")
	private String userId;

	@Column(name = "password")
	private String password;

	public long getAltKey() {
		return altKey;
	}

	public void setAltKey(long altKey) {
		this.altKey = altKey;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Date getDateofBirth() {
		return dateofBirth;
	}

	public void setDateofBirth(Date dateofBirth) {
		this.dateofBirth = dateofBirth;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "customer_id")
	private List<BankDetails> bankdetailsList;

	public List<BankDetails> getBankdetailsList() {
		return bankdetailsList;

	}

	public void setBankdetailsList(List<BankDetails> bankdetailsList) {
		this.bankdetailsList = bankdetailsList;
	}

}
