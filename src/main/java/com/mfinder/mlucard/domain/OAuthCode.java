package com.mfinder.mlucard.domain;

import javax.persistence.Entity;
 

@Entity(name = "oauth_code")
public class OAuthCode {
	private String code;
	private String authentication;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getAuthentication() {
		return authentication;
	}
	public void setAuthentication(String authentication) {
		this.authentication = authentication;
	}
}
