package com.mfinder.mlucard.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @author thein
 * @createdAt Apr 7, 2019
 */
@Entity(name = "authorities")
public class OAuthRole {

	@Column(name = "username", nullable = false, length = 45)
	private Long userName;

	@Column(name = "authority", nullable = false, length = 45)
	private String authority;

	public Long getUserName() {
		return userName;
	}

	public void setUserName(Long userName) {
		this.userName = userName;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

}
