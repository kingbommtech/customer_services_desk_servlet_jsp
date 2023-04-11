package com.nacre.cust.dto;

import java.sql.Date;

public class FeedbackDto {
	
	protected Date feedback_date;
	protected String feedback_text;
	protected String email_id;
	protected int cust_id;
	protected int comp_reg_id;
	public FeedbackDto(int cust_id, String feedback_text, String email_id, int comp_reg_id) {
		this.cust_id = cust_id;
		this.feedback_text = feedback_text;
		this.email_id = email_id;
		this.comp_reg_id = comp_reg_id;
	}
	public FeedbackDto(Date feedback_date, String feedback_text, String email_id, int cust_id, int comp_reg_id) {
		super();
		this.feedback_date = feedback_date;
		this.feedback_text = feedback_text;
		this.email_id = email_id;
		this.cust_id = cust_id;
		this.comp_reg_id = comp_reg_id;
	}
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	public String getFeedback_text() {
		return feedback_text;
	}
	public void setFeedback_text(String feedback_text) {
		this.feedback_text = feedback_text;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public int getComp_reg_id() {
		return comp_reg_id;
	}
	public void setComp_reg_id(int comp_reg_id) {
		this.comp_reg_id = comp_reg_id;
	}
	public Date getFeedback_date() {
		return feedback_date;
	}
	public void setFeedback_date(Date feedback_date) {
		this.feedback_date = feedback_date;
	}
	

}
