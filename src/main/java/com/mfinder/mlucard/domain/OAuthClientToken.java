package com.mfinder.mlucard.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "oauth_client_token")
public class OAuthClientToken {
	
	@Column(name="token_id", nullable = false, length = 45)
	private String tokenId;
	
	@Column(name="token", nullable = false, length = 45)
	private String token;
	
	@Column(name="authentication_id", nullable = false, length = 45)
	private String authencationId;
	
	@Column(name="user_name", nullable = false, length = 45)
	private String userName;
	
	@Column(name="client_id", nullable = false, length = 45)
	private String clientId;

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

	public String getAuthencationId() {
		return authencationId;
	}

	public void setAuthencationId(String authencationId) {
		this.authencationId = authencationId;
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
}
