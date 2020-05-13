package com.happy.bloodbank.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class PersonDetails implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer person_id;
	private String first_name;
	private String last_name;
	private String gender;
	private String city;
	private String state;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn()
	private BloodDetails BG_FK;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn()
    private Country Country_fk;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn()
	private AccountDetails account_fk;
	
	
	public Integer getId() {
		return person_id;
	}

	public void setId(Integer id) {
		this.person_id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public BloodDetails getBG_FK() {
		return BG_FK;
	}

	public void setBG_FK(BloodDetails bG_FK) {
		BG_FK = bG_FK;
	}

	public Country getCountry_fk() {
		return Country_fk;
	}

	public void setCountry_fk(Country country_fk) {
		Country_fk = country_fk;
	}

	public AccountDetails getAccount_fk() {
		return account_fk;
	}

	public void setAccount_fk(AccountDetails account_fk) {
		this.account_fk = account_fk;
	}

	
	
	
}