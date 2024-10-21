package org.Friday.assosiationtype.onetomany;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "bank_info")
public class BankDetails implements Serializable {

	@Id
	@GenericGenerator(name = "auto_gen", strategy = "increment")
	@GeneratedValue(generator = "auto_gen")
	@Column(name = "alt_key")
	private long altKey;

	@Column(name = "bank_name")
	private String bankName;

	@Column(name = "account_number")
	private String accountNumber;

	@Column(name = "account_type")
	private String accountType;

	@Column(name = "account_opendate")
	private Date accountOpendate;

	@Column(name = "branch")
	private String branch;

	@Column(name = "bank_sector")
	private String bankSector;

	public long getAltKey() {
		return altKey;
	}

	public void setAltKey(long altKey) {
		this.altKey = altKey;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Date getAccountOpendate() {
		return accountOpendate;
	}

	public void setAccountOpendate(Date accountOpendate) {
		this.accountOpendate = accountOpendate;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getBankSector() {
		return bankSector;
	}

	public void setBankSector(String bankSector) {
		this.bankSector = bankSector;
	}

}
