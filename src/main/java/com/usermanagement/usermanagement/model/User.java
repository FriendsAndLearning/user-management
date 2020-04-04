package com.usermanagement.usermanagement.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "User")
public class User {

	@Transient
	public static final String SEQUENCE_NAME = "users_sequence";

	@Id
	private long id;

	@NotBlank
	@Size(max = 50)
	@Indexed(unique = true)
	private String fullName;

	@NotBlank
	@Size(max = 50)
	@Indexed(unique = true)
	private String emailId;

	@NotBlank
	@Size(max = 10)
	@Indexed(unique = true)
	private String dateOfBirth;

	@NotBlank
	@Size(max = 10)
	@Indexed(unique = true)
	private String mobileNumber;

	@NotBlank
	@Size(max = 50)
	@Indexed(unique = true)
	private String loginType;

	public User() {

	}

	public User(long id, String fullName, String emailId, String dateOfBirth, String mobileNumber, String loginType) {
		this.id = id;
		this.fullName = fullName;
		this.emailId = emailId;
		this.dateOfBirth = dateOfBirth;
		this.mobileNumber = mobileNumber;
		this.loginType = loginType;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getLoginType() {
		return loginType;
	}

	public void setLoginType(String loginType) {
		this.loginType = loginType;
	}

}
