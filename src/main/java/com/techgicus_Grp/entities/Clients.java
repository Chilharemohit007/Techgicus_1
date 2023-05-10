package com.techgicus_Grp.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Clients {
	@Id
	private long id;
	private String date;
	private String clientName;
	private String email;
	private String mobile;
	private String address;
	private String organisation;
	private String requirement;
	private String projectScheduleDate;
	private String clientSource;
	private String amountPaid;
	private String amountBalance;
	private String paymentDate;
	private String paymentMode;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getOrganisation() {
		return organisation;
	}
	public void setOrganisation(String organisation) {
		this.organisation = organisation;
	}
	public String getRequirement() {
		return requirement;
	}
	public void setRequirement(String requirement) {
		this.requirement = requirement;
	}
	public String getProjectScheduleDate() {
		return projectScheduleDate;
	}
	public void setProjectScheduleDate(String projectScheduleDate) {
		this.projectScheduleDate = projectScheduleDate;
	}
	public String getClientSource() {
		return clientSource;
	}
	public void setClientSource(String clientSource) {
		this.clientSource = clientSource;
	}
	public String getAmountPaid() {
		return amountPaid;
	}
	public void setAmountPaid(String amountPaid) {
		this.amountPaid = amountPaid;
	}
	public String getAmountBalance() {
		return amountBalance;
	}
	public void setAmountBalance(String amountBalance) {
		this.amountBalance = amountBalance;
	}
	public String getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	
}
