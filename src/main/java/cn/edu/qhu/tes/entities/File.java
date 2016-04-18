package cn.edu.qhu.tes.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import cn.edu.qhu.tes.dao.Identifiable;

@Entity
public class File implements Identifiable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Integer id;
	private String contentType;
	private String name;
	private String path;
	@ManyToOne
	@JoinColumn(name = "conclusion_id")
	private Conclusion conclusion;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Conclusion getConclusion() {
		return conclusion;
	}

	public void setConclusion(Conclusion conclusion) {
		this.conclusion = conclusion;
	}

}
