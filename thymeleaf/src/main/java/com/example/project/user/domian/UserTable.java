package com.example.project.user.domian;

public class UserTable {
	
	private String name;
	private String account;
	private String password;
	private String registerdate;
	private String mail;
	private String phonenumber;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRegisterdate() {
		return registerdate;
	}
	public void setRegisterdate(String registerdate) {
		this.registerdate = registerdate;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public UserTable() {
	}
	
	
	
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public UserTable(String name, String account, String password, String registerdate, String mail, String phonenumber) {
		this.name = name;
		this.account = account;
		this.password = password;
		this.registerdate = registerdate;
		this.mail = mail;
		this.phonenumber = phonenumber;
	}
	
	

}
