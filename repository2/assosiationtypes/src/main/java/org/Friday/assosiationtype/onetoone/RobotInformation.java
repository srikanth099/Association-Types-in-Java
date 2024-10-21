package org.Friday.assosiationtype.onetoone;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "robot_info")
public class RobotInformation implements Serializable {
	@Id
	@GenericGenerator(name = "auto_gen", strategy = "increment")
	@GeneratedValue(generator = "auto_gen")
	@Column(name = "alt_key")
	private long altKey;

	@Column(name = "internet_protocol")
	private int internetProtocol;

	@Column(name = "serial_number")
	private String serialNumber;

	@Column(name = "software_version")
	private String softwareVersion;

	@Column(name = "neural_schema")
	private String neuralSchema;

	@Column(name = "NTA")
	private String networkAddressTrancilation;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "forigen_key")
	private Robot robot;


	public long getAltKey() {
		return altKey;
	}

	public void setAltKey(long altKey) {
		this.altKey = altKey;
	}

	public int getInternetProtocol() {
		return internetProtocol;
	}

	public void setInternetProtocol(int internetProtocol) {
		this.internetProtocol = internetProtocol;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getSoftwareVersion() {
		return softwareVersion;
	}

	public void setSoftwareVersion(String softwareVersion) {
		this.softwareVersion = softwareVersion;
	}

	public String getNeuralSchema() {
		return neuralSchema;
	}

	public void setNeuralSchema(String neuralSchema) {
		this.neuralSchema = neuralSchema;
	}

	public String getNetworkAddressTrancilation() {
		return networkAddressTrancilation;
	}

	public void setNetworkAddressTrancilation(String networkAddressTrancilation) {
		this.networkAddressTrancilation = networkAddressTrancilation;
	}
	
	public Robot getRobot() {
		return robot;
	}

	public void setRobot(Robot robot) {
		this.robot = robot;
	}
	
	
	

}
