package com.nacre.cust.dto;

import java.sql.Date;

public class ComplaintDto {
	protected int comp_reg_id;
	protected Date comp_date;
	protected String text_of_comp;
	protected int cust_id;
	protected int ser_cust_dom_id;
	public int getComp_reg_id() {
		return comp_reg_id;
	}
	public void setComp_reg_id(int comp_reg_id) {
		this.comp_reg_id = comp_reg_id;
	}
	public Date getComp_date() {
		return comp_date;
	}
	public void setComp_date(Date comp_date) {
		this.comp_date = comp_date;
	}
	public String getText_of_comp() {
		return text_of_comp;
	}
	public void setText_of_comp(String text_of_comp) {
		this.text_of_comp = text_of_comp;
	}
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	public int getSer_cust_dom_id() {
		return ser_cust_dom_id;
	}
	public void setSer_cust_dom_id(int ser_cust_dom_id) {
		this.ser_cust_dom_id = ser_cust_dom_id;
	}
	public ComplaintDto(String text_of_comp, int cust_id, int ser_cust_dom_id) {
		super();
		this.text_of_comp = text_of_comp;
		this.cust_id = cust_id;
		this.ser_cust_dom_id = ser_cust_dom_id;
	}
	public ComplaintDto(int comp_reg_id, Date comp_date, String text_of_comp, int cust_id) {
		super();
		this.comp_reg_id = comp_reg_id;
		this.comp_date = comp_date;
		this.text_of_comp = text_of_comp;
		this.cust_id = cust_id;
	}
	

}
