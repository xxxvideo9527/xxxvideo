package com.huy.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "data")
public class Data implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private int id;

	@NotEmpty
	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "about1")
	private String about1;
	
	@Column(name = "about2")
	private String about2;	
	
	@Column(name = "about3")
	private String about3;

	@Column(name = "about4")
	private String about4;
	
	public Data() {
		super();
	}

	public Data(int id, String name, String about1, String about2, String about3, String about4) {
		super();
		this.id = id;
		this.name = name;
		this.about1 = about1;
		this.about2 = about2;
		this.about3 = about3;
		this.about4 = about4;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAbout1() {
		return about1;
	}

	public void setAbout1(String about1) {
		this.about1 = about1;
	}
	
	public String getAbout2() {
		return about2;
	}

	public void setAbout2(String about2) {
		this.about2 = about2;
	}

	public String getAbout3() {
		return about3;
	}

	public void setAbout3(String about3) {
		this.about3 = about3;
	}

	public String getAbout4() {
		return about4;
	}

	public void setAbout4(String about4) {
		this.about4 = about4;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
