package com.mfinder.mlucard.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "oauth_access_token ")
public class OAuthAccessToken {
	@Column(name = "token_id", nullable = false, length = 45)
	private String tokenId;

	@Column(name = "token", nullable = false, length = 45)
	private String token;

	@Column(name = "authentication_id", nullable = false, length = 45)
	private String authenticationId;

	@Column(name = "user_name", nullable = false, length = 45)
	private String userName;

	@Column(name = "client_id", nullable = false, length = 45)
	private String clientId;

	@Column(name = "authentication", nullable = false, length = 45)
	private String authentication;

	public String getTokenId() {
		return tokenId;
	}

	public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getAuthenticationId() {
		return authenticationId;
	}

	public void setAuthenticationId(String authenticationId) {
		this.authenticationId = authenticationId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getAuthentication() {
		return authentication;
	}

	public void setAuthentication(String authentication) {
		this.authentication = authentication;
	}

}
