package com.choudhury.domain;

import java.util.Date;

public class AttendanceDetails {

	private Long empId;
	
	private Date loginTime;
	
	private Date logoutTime;
	
	private String logoutSource;
	
	private String loginSource;
	
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
	
	
	
	
	
	
}
