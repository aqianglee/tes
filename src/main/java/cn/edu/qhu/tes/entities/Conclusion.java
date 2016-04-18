package cn.edu.qhu.tes.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import cn.edu.qhu.tes.dao.Identifiable;

//@Entity
public class Conclusion implements Identifiable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
