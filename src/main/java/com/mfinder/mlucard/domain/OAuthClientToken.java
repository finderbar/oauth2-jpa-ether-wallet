package com.mfinder.mlucard.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity(name="oauth_client_token")
public class OAuthClientToken {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="token_id")
	private String tokenId;
	
	@Column(name="token")
	private String token;
	
	@Column(name="authentication_id")
	private String authencationId;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="client_id")
	private String clientId;
	
	
	public OAuthClientToken() {	}

	/**
	 * @param tokenId
	 * @param token
	 * @param authencationId
	 * @param userName
	 * @param clientId
	 */
	public OAuthClientToken(String tokenId, String token, String authencationId, String userName, String clientId) {
		this.tokenId = tokenId;
		this.token = token;
		this.authencationId = authencationId;
		this.userName = userName;
		this.clientId = clientId;
	}

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
