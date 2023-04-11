package com.nacre.cust.dto;



public class CustServiceDomDto {
	protected int ser_cust_dom_id;
	protected String ser_cust_dom_name;
	protected Long ser_cust_dom_phno;	
	protected String ser_cust_dom_email;
	protected String ser_cust_dom_addr;
	protected int ser_cust_id;
	public int getSer_cust_dom_id() {
		return ser_cust_dom_id;
	}
	public void setSer_cust_dom_id(int ser_cust_dom_id) {
		this.ser_cust_dom_id = ser_cust_dom_id;
	}
	public String getSer_cust_dom_name() {
		return ser_cust_dom_name;
	}
	public void setSer_cust_dom_name(String ser_cust_dom_name) {
		this.ser_cust_dom_name = ser_cust_dom_name;
	}
	public Long getSer_cust_dom_phno() {
		return ser_cust_dom_phno;
	}
	public void setSer_cust_dom_phno(Long ser_cust_dom_phno) {
		this.ser_cust_dom_phno = ser_cust_dom_phno;
	}
	public String getSer_cust_dom_email() {
		return ser_cust_dom_email;
	}
	public void setSer_cust_dom_email(String ser_cust_dom_email) {
		this.ser_cust_dom_email = ser_cust_dom_email;
	}
	public String getSer_cust_dom_addr() {
		return ser_cust_dom_addr;
	}
	public void setSer_cust_dom_addr(String ser_cust_dom_addr) {
		this.ser_cust_dom_addr = ser_cust_dom_addr;
	}
	
	public int getSer_cust_id() {
		return ser_cust_id;
	}
	public void setSer_cust_id(int ser_cust_id) {
		this.ser_cust_id = ser_cust_id;
	}
	public CustServiceDomDto(int ser_cust_dom_id, String ser_cust_dom_name, Long ser_cust_dom_phno,
			String ser_cust_dom_email, String ser_cust_dom_addr) {
		super();
		this.ser_cust_dom_id = ser_cust_dom_id;
		this.ser_cust_dom_name = ser_cust_dom_name;
		this.ser_cust_dom_phno = ser_cust_dom_phno;
		this.ser_cust_dom_email = ser_cust_dom_email;
		this.ser_cust_dom_addr = ser_cust_dom_addr;
	}
	public CustServiceDomDto(String ser_cust_dom_name, Long ser_cust_dom_phno, String ser_cust_dom_email,
			String ser_cust_dom_addr, int ser_cust_id) {
		super();
		this.ser_cust_dom_name = ser_cust_dom_name;
		this.ser_cust_dom_phno = ser_cust_dom_phno;
		this.ser_cust_dom_email = ser_cust_dom_email;
		this.ser_cust_dom_addr = ser_cust_dom_addr;
		this.ser_cust_id = ser_cust_id;
	}
	
	

}
