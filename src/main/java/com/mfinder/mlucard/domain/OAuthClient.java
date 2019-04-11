package com.mfinder.mlucard.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "oauth_client_details")
public class OAuthClient {

	@Column(name = "client_id", nullable = false, length = 45)
	private String clientId;

	@Column(name = "resource_id", nullable = false, length = 45)
	private String resourceId;

	@Column(name = "client_secret", nullable = false, length = 45)
	private String clientSerect;

	@Column(name = "scope", nullable = false, length = 45)
	private String scope;

	@Column(name = "authorized_grant_types", nullable = false, length = 45)
	private String authGrantTypes;

	@Column(name = "web_server_redirect_uri", nullable = false, length = 45)
	private String redirectUri;

	@Column(name = "authorities", nullable = false, length = 45)
	private String authorities;

	@Column(name = "access_token_validity", nullable = false, length = 45)
	private Integer accessTokenValidity;

	@Column(name = "refresh_token_validity", nullable = false, length = 45)
	private Integer refreshTokenValidity;

	@Column(name = "additional_information", nullable = false, length = 45)
	private String additionalInfo;

	@Column(name = "autoapprove", nullable = false, length = 45)
	private String autoApprove;

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getResourceId() {
		return resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public String getClientSerect() {
		return clientSerect;
	}

	public void setClientSerect(String clientSerect) {
		this.clientSerect = clientSerect;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getAuthGrantTypes() {
		return authGrantTypes;
	}

	public void setAuthGrantTypes(String authGrantTypes) {
		this.authGrantTypes = authGrantTypes;
	}

	public String getRedirectUri() {
		return redirectUri;
	}

	public void setRedirectUri(String redirectUri) {
		this.redirectUri = redirectUri;
	}

	public String getAuthorities() {
		return authorities;
	}

	public void setAuthorities(String authorities) {
		this.authorities = authorities;
	}

	public Integer getAccessTokenValidity() {
		return accessTokenValidity;
	}

	public void setAccessTokenValidity(Integer accessTokenValidity) {
		this.accessTokenValidity = accessTokenValidity;
	}

	public Integer getRefreshTokenValidity() {
		return refreshTokenValidity;
	}

	public void setRefreshTokenValidity(Integer refreshTokenValidity) {
		this.refreshTokenValidity = refreshTokenValidity;
	}

	public String getAdditionalInfo() {
		return additionalInfo;
	}

	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
	}

	public String getAutoApprove() {
		return autoApprove;
	}

	public void setAutoApprove(String autoApprove) {
		this.autoApprove = autoApprove;
	}

}
