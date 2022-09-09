package com.project.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Admin_id;
	private String Admin_mail;
	private String Admin_password;
	public int getAdmin_id() {
		return Admin_id;
	}
	public void setAdmin_id(int admin_id) {
		Admin_id = admin_id;
	}
	public String getAdmin_mail() {
		return Admin_mail;
	}
	public void setAdmin_mail(String admin_mail) {
		Admin_mail = admin_mail;
	}
	public String getAdmin_password() {
		return Admin_password;
	}
	public void setAdmin_password(String admin_password) {
		Admin_password = admin_password;
	}
	@Override
	public String toString() {
		return "Admin [Admin_id=" + Admin_id + ", Admin_mail=" + Admin_mail + ", Admin_password=" + Admin_password
				+ "]";
	}
	
	
}