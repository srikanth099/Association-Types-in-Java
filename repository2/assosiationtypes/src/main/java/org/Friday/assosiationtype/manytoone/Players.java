package org.Friday.assosiationtype.manytoone;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "ipl_players_info1")
public class Players implements Serializable {
	@Id
	@GenericGenerator(name = "auto_gen", strategy = "increment")
	@GeneratedValue(generator = "auti_gen")
	@Column(name = "alt_key")
	private long altKey;

	@Column(name = "name")
	private String name;

	@Column(name = "email")
	private String email;

	@Column(name = "hight")
	private String hight;

	@Column(name = "total_runs")
	private int totalRuns;

	@Column(name = "higest_score")
	private String higestScore;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHight() {
		return hight;
	}

	public void setHight(String hight) {
		this.hight = hight;
	}

	public int getTotalRuns() {
		return totalRuns;
	}

	public void setTotalRuns(int totalRuns) {
		this.totalRuns = totalRuns;
	}

	public String getHigestScore() {
		return higestScore;
	}

	public void setHigestScore(String higestScore) {
		this.higestScore = higestScore;
	}
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private List<Players> playerDetailsList;

	public List<Players> getPlayerDetailsList() {
		return playerDetailsList;
	}

	public void setPlayerDetailsList(List<Players> playerDetailsList) {
		this.playerDetailsList = playerDetailsList;
	}
	
	
	
	
	
}
