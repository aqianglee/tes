package cn.edu.qhu.tes.entities;

import javax.persistence.Entity;

@Entity
public class Student extends User {

	private static final long serialVersionUID = 1L;
	private String number;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

}
