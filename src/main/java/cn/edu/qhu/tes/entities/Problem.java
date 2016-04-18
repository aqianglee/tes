package cn.edu.qhu.tes.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import cn.edu.qhu.tes.dao.Identifiable;

@Entity
public class Problem implements Identifiable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Integer id;
	@Column(length = 3000)
	private String content;
	@ManyToOne
	@JoinColumn(name = "evaluation_id")
	private Evaluation evaluation;
	private Integer displayOrder;
	private ProblemType problemType;
	private String ProblemType2;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Evaluation getEvaluation() {
		return evaluation;
	}

	public void setEvaluation(Evaluation evaluation) {
		this.evaluation = evaluation;
	}

	public Integer getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(Integer displayOrder) {
		this.displayOrder = displayOrder;
	}

	public ProblemType getProblemType() {
		return problemType;
	}

	public void setProblemType(ProblemType problemType) {
		this.problemType = problemType;
	}

	public String getProblemType2() {
		return ProblemType2;
	}

	public void setProblemType2(String problemType2) {
		ProblemType2 = problemType2;
	}

}
