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
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "ipl_team_info1")
public class IPLTeams implements Serializable {

	@Id
	@GenericGenerator(name = "auto_gen", strategy = "increment")
	@GeneratedValue(generator = "auto_gen")
	@Column(name = "alt_key")
	private long altKey;

	@Column(name = "team_name")
	private String teamName;

	@Column(name = "captian")
	private String captian;

	@Column(name = "team_couch")
	private String teamCouch;

	@Column(name = "team_state")
	private String state;

	public long getAltKey() {
		return altKey;
	}

	public void setAltKey(long altKey) {
		this.altKey = altKey;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getCaptian() {
		return captian;
	}

	public void setCaptian(String captian) {
		this.captian = captian;
	}

	public String getTeamCouch() {
		return teamCouch;
	}

	public void setTeamCouch(String teamCouch) {
		this.teamCouch = teamCouch;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "user_id")
//	private List<Players> playerDetailsList;
//
//	public List<Players> getPlayerDetailsList() {
//		return playerDetailsList;
//	}
//
//	public void setPlayerDetailsList(List<Players> playerDetailsList) {
//		this.playerDetailsList = playerDetailsList;
//	}
	

}
