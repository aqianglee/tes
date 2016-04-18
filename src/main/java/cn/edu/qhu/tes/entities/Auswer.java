package cn.edu.qhu.tes.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import cn.edu.qhu.tes.dao.Identifiable;

@Entity
public class Auswer implements Identifiable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Integer id;
	@Column(length = 3000)
	private String Content;
	private Integer score;
	private String optionsId;// 存在多选的问题，所以就
	@ManyToOne
	@JoinColumn(name = "student_id")
	private Student student;
	@ManyToOne
	@JoinColumn(name = "problem_id")
	private Problem problem;
	private ProblemType problemType;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public String getOptionsId() {
		return optionsId;
	}

	public void setOptionsId(String optionsId) {
		this.optionsId = optionsId;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Problem getProblem() {
		return problem;
	}

	public void setProblem(Problem problem) {
		this.problem = problem;
	}

	public ProblemType getProblemType() {
		return problemType;
	}

	public void setProblemType(ProblemType problemType) {
		this.problemType = problemType;
	}

}
