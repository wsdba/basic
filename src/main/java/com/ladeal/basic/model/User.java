package com.ladeal.basic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name="user", catalog = "zz")
public class User implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3889010529344338351L;

	private Integer id ;
	
	private String name;
	
	private String account;
	
	private String password;

	@Id
	@GeneratedValue
	@Column(name="id" ,unique = true , nullable = false)
	public  Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name = "name" ,length= 20)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "account")
	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}
	@Column(name = "password")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
