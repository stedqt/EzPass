package com.choudhury.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ATTENANCE_DATA")
public  class AttendanceEntity {

	@Id
	private Long id;
	
	@Column(name="EMP_ID")
	private Long empId;
	
	@Column(name="LOGIN_TIME")
	private Date loginTime;

	@Column(name="LOGOUT_TIME")
	private Date logoutTime;

	@Column(name="LOGOUT_SOURCE")
	private String logoutSource;
	
	/**
	 * 
	 */
	@Column(name="LOGIN_SOURCE")
	private String loginSource;
	
	@Column(name="CONSOLIDATES_Hours")
	private String consolidatedHours;
	
	
	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public Date getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	public Date getLogoutTime() {
		return logoutTime;
	}

	public void setLogoutTime(Date logoutTime) {
		this.logoutTime = logoutTime;
	}

	public String getLogoutSource() {
		return logoutSource;
	}

	public void setLogoutSource(String logoutSource) {
		this.logoutSource = logoutSource;
	}

	public String getLoginSource() {
		return loginSource;
	}

	public void setLoginSource(String loginSource) {
		this.loginSource = loginSource;
	}

	public String getConsolidatedHours() {
		return consolidatedHours;
	}

	public void setConsolidatedHours(String consolidatedHours) {
		this.consolidatedHours = consolidatedHours;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
