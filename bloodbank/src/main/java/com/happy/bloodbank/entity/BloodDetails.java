package com.happy.bloodbank.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class BloodDetails implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bg_id;
	private String blood_Group;
	private Integer quantity;
	public Integer getBg_id() {
		return bg_id;
	}
	public void setBg_id(Integer bg_id) {
		this.bg_id = bg_id;
	}
	public String getBlood_Group() {
		return blood_Group;
	}
	public void setBlood_Group(String blood_Group) {
		this.blood_Group = blood_Group;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	
}