package cn.edu.qhu.tes.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import cn.edu.qhu.tes.dao.Identifiable;

@Entity
public class Evaluation implements Identifiable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer id;
	private String title;
	@ManyToOne
	@JoinColumn(name = "teacher_id")
	private Teacher teacher;
	private String workFlowStatus;
	private String studentsId; // 这里存储分配给作答的学生的id然后用逗号割开例如 1,2,3
	private Boolean anonymity; // 是否为匿名调查
	@ManyToOne
	@JoinColumn(name = "team_id")
	private Team team;

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public String getWorkFlowStatus() {
		return workFlowStatus;
	}

	public void setWorkFlowStatus(String workFlowStatus) {
		this.workFlowStatus = workFlowStatus;
	}

	public String getStudentsId() {
		return studentsId;
	}

	public void setStudentsId(String studentsId) {
		this.studentsId = studentsId;
	}

	public Boolean getAnonymity() {
		return anonymity;
	}

	public void setAnonymity(Boolean anonymity) {
		this.anonymity = anonymity;
	}

}
