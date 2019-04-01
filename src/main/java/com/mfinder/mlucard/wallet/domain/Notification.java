package com.mfinder.mlucard.wallet.domain;

public class Notification {
	private int id;
	private String userName;
	private String title;
	
	/**
	 * @param id
	 * @param userName
	 * @param title
	 */
	public Notification(int id, String userName, String title) {
		this.id = id;
		this.userName = userName;
		this.title = title;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Notification [id=" + id + ", userName=" + userName + ", title=" + title + "]";
	}
	
}
