package com.happy.bloodbank.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class State implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer state_id;
	private String state;
	
	@OneToOne
	@JoinColumn
	private Country country_fk;
	
	public Integer getState_id() {
		return state_id;
	}
	public void setState_id(Integer state_id) {
		this.state_id = state_id;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
}