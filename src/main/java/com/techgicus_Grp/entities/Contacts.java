package com.techgicus_Grp.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Contacts {
	@Id
	private long id;
	private String firstName;
	private String lastName;
	private String email;
	private String mobile;
	private String courseName;
	private String batch;
	private String address;
	private String internSource;
	private String joiningDate;
	private String advanceFees;
	private String balanceFees;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getInternSource() {
		return internSource;
	}
	public void setInternSource(String internSource) {
		this.internSource = internSource;
	}
	public String getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(String joiningDate) {
		this.joiningDate = joiningDate;
	}
	public String getAdvanceFees() {
		return advanceFees;
	}
	public void setAdvanceFees(String advanceFees) {
		this.advanceFees = advanceFees;
	}
	public String getBalanceFees() {
		return balanceFees;
	}
	public void setBalanceFees(String balanceFees) {
		this.balanceFees = balanceFees;
	}
}
