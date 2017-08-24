package com.choudhury.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class TelematryEntity {


	@Id
	private Long id;
	
	
	@Column(name="DEV_UUID")
	private String deviceUuid;
	

	@Column(name="EMP_ID")
	private Long empId;
	
	@OneToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="EMPLOYEE_ID",referencedColumnName="Id")
	private EmployeeEntity employeeDetails;
	
	@JoinColumn(name="ATTENDANCE_ID",referencedColumnName="Id")
	@OneToOne(cascade={CascadeType.ALL})
	private AttendanceEntity attendance;

	public AttendanceEntity getAttendance() {
		return attendance;
	}

	public void setAttendance(AttendanceEntity attendance) {
		this.attendance = attendance;
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDeviceUuid() {
		return deviceUuid;
	}

	public void setDeviceUuid(String deviceUuid) {
		this.deviceUuid = deviceUuid;
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public EmployeeEntity getEmployeeDetails() {
		return employeeDetails;
	}

	public void setEmployeeDetails(EmployeeEntity employeeDetails) {
		this.employeeDetails = employeeDetails;
	}
}
