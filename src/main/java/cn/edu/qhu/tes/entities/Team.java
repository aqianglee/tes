package cn.edu.qhu.tes.entities;

import javax.persistence.Entity;

import cn.edu.qhu.tes.dao.Identifiable;

@Entity
public class Team implements Identifiable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer beginYear;
	private Integer endYear;
	private String team;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getBeginYear() {
		return beginYear;
	}

	public void setBeginYear(Integer beginYear) {
		this.beginYear = beginYear;
	}

	public Integer getEndYear() {
		return endYear;
	}

	public void setEndYear(Integer endYear) {
		this.endYear = endYear;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

}
