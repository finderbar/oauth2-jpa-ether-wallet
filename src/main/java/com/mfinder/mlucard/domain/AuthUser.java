package com.mfinder.mlucard.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author thein
 * @createdAt Mar 16, 2019
 */

@Entity(name = "users")
public class AuthUser {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String userName;
	private String email;
	private String password;
	
	@OneToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL) 
	private List<UserRole> roles;

	public AuthUser() {
	}
	

	/**
	 * @param id
	 * @param userName
	 * @param email
	 * @param password
	 * @param roles
	 */
	public AuthUser(Long id, String userName, String email, String password, List<UserRole> roles) {
		super();
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.roles = roles;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<UserRole> getRoles() {
		return roles;
	}

	public void setRoles(List<UserRole> roles) {
		this.roles = roles;
	}

}
