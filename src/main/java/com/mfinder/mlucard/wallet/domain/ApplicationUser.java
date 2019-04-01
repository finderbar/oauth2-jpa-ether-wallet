package com.mfinder.mlucard.wallet.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="user")
public class ApplicationUser {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userSeq;

	private String firstName;
	private String lastName;
	private String fullName;
	private String email;
	private String gender;

	public Long getUserSeq() {
		return userSeq;
	}

	public void setUserSeq(Long userSeq) {
		this.userSeq = userSeq;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "User [userSeq=" + userSeq + ", firstName=" + firstName + ", lastName=" + lastName + ", fullName="
				+ fullName + ", email=" + email + ", gender=" + gender + "]";
	}

}
