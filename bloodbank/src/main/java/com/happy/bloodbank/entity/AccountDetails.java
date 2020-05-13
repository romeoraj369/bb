package com.happy.bloodbank.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class AccountDetails implements Serializable {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer account_ID;
	private String email;
	private String password;
	private String phone;
	private Boolean phoone_privacy;
	public Integer getAccount_ID() {
		return account_ID;
	}
	public void setAccount_ID(Integer account_ID) {
		this.account_ID = account_ID;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Boolean getPhoone_privacy() {
		return phoone_privacy;
	}
	public void setPhoone_privacy(Boolean phoone_privacy) {
		this.phoone_privacy = phoone_privacy;
	}
	
	
	
}