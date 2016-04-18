package cn.edu.qhu.tes.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import cn.edu.qhu.tes.dao.Identifiable;

@Entity
public class Student implements Identifiable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Integer id;
	private String username;
	private String password;
	private String number;
	private String compellation;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getCompellation() {
		return compellation;
	}

	public void setCompellation(String compellation) {
		this.compellation = compellation;
	}

}
