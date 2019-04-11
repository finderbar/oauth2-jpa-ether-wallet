package com.mfinder.mlucard.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "oauth_refresh_token")
public class OAuthRefreshToken {

	@Column(name = "token_id", nullable = false, length = 45)
	private String tokenId;
	@Column(name = "token", nullable = false, length = 45)
	private String token;
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

	public String getAuthentication() {
		return authentication;
	}

	public void setAuthentication(String authentication) {
		this.authentication = authentication;
	}

}
