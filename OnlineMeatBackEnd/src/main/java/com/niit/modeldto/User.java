package com.niit.modeldto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class User 
{
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private int cust_id;
	private String cust_name;
	private String cust_mail;
	private String cust_pwd;
	private String cust_conf_pwd;
	
	private int cust_phone;
	private String role;
	private boolean enable=true;
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public String getCust_mail() {
		return cust_mail;
	}
	public void setCust_mail(String cust_mail) {
		this.cust_mail = cust_mail;
	}
	public String getCust_pwd() {
		return cust_pwd;
	}
	public void setCust_pwd(String cust_pwd) {
		this.cust_pwd = cust_pwd;
	}
	public int getCust_phone() {
		return cust_phone;
	}
	public String getCust_conf_pwd() {
		return cust_conf_pwd;
	}
	public void setCust_conf_pwd(String cust_conf_pwd) {
		this.cust_conf_pwd = cust_conf_pwd;
	}
	public void setCust_phone(int cust_phone) {
		this.cust_phone = cust_phone;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public boolean isEnable() {
		return enable;
	}
	public void setEnable(boolean enable) {
		this.enable = enable;
	}
}
