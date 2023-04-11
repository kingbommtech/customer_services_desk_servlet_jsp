package com.nacre.cust.dto;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Date;
public class CustRegistrationDto {
	private String fname=null;
	
	private long phone=0;
	private String email=null;
	private File file=null;
	private FileInputStream photo=null;
	private Date dob=null;
	private String addr=null;
	private String uname=null;
	private String pass=null;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public FileInputStream getPhoto() {
		return photo;
	}
	public void setPhoto(FileInputStream photo) {
		this.photo = photo;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		this.file = file;
	}

}
