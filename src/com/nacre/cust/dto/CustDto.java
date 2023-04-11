package com.nacre.cust.dto;

public class CustDto {
	
	
	protected int cust_id;
	protected String cust_fname;
	protected long cust_phno;
	protected String cust_addr;
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	public CustDto() {
		super();
	}
	public String getCust_fname() {
		return cust_fname;
	}
	public void setCust_fname(String cust_fname) {
		this.cust_fname = cust_fname;
	}
	public long getCust_phno() {
		return cust_phno;
	}
	public void setCust_phno(long cust_phno) {
		this.cust_phno = cust_phno;
	}
	public String getCust_addr() {
		return cust_addr;
	}
	public void setCust_addr(String cust_addr) {
	this.cust_addr = cust_addr;
	}
	public CustDto(int cust_id, String cust_fname, long cust_phno, String cust_addr) {
		super();
		this.cust_id = cust_id;
		this.cust_fname = cust_fname;
		this.cust_phno = cust_phno;
		this.cust_addr = cust_addr;
	}
	

}
