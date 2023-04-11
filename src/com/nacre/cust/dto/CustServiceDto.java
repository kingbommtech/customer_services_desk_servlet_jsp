package com.nacre.cust.dto;

import java.sql.Date;

public class CustServiceDto {
	protected int ser_cust_id;
	protected String ser_cust_name;
	protected Date ser_cust_date;
	protected String ser_cust_addr;
	protected Long ser_cust_phno;
	protected String ser_cust_email;
	protected int cust_id;
	public int getSer_cust_id() {
		return ser_cust_id;
	}
	public void setSer_cust_id(int ser_cust_id) {
		this.ser_cust_id = ser_cust_id;
	}
	public String getSer_cust_name() {
		return ser_cust_name;
	}
	public void setSer_cust_name(String ser_cust_name) {
		this.ser_cust_name = ser_cust_name;
	}
	public Date getSer_cust_date() {
		return ser_cust_date;
	}
	public void setSer_cust_date(Date ser_cust_date) {
		this.ser_cust_date = ser_cust_date;
	}
	public String getSer_cust_addr() {
		return ser_cust_addr;
	}
	public void setSer_cust_addr(String ser_cust_addr) {
		this.ser_cust_addr = ser_cust_addr;
	}
	public Long getSer_cust_phno() {
		return ser_cust_phno;
	}
	public void setSer_cust_phno(Long ser_cust_phno) {
		this.ser_cust_phno = ser_cust_phno;
	}
	public String getSer_cust_email() {
		return ser_cust_email;
	}
	public void setSer_cust_email(String ser_cust_email) {
		this.ser_cust_email = ser_cust_email;
	}
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	public CustServiceDto(String ser_cust_name, String ser_cust_addr, Long ser_cust_phno, String ser_cust_email,
			int cust_id) {
		this.ser_cust_name = ser_cust_name;
		this.ser_cust_addr = ser_cust_addr;
		this.ser_cust_phno = ser_cust_phno;
		this.ser_cust_email = ser_cust_email;
		this.cust_id = cust_id;
	}
	public CustServiceDto(int ser_cust_id, String ser_cust_name, Date ser_cust_date, String ser_cust_addr,
			Long ser_cust_phno, String ser_cust_email) {
		super();
		this.ser_cust_id = ser_cust_id;
		this.ser_cust_name = ser_cust_name;
		this.ser_cust_date = ser_cust_date;
		this.ser_cust_addr = ser_cust_addr;
		this.ser_cust_phno = ser_cust_phno;
		this.ser_cust_email = ser_cust_email;
	}
	

}
