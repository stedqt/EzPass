package com.choudhury.domain;

public class TelematryData {

	private String deviceUuid;
	
	
	private Long empId;
	
	private EmployeeDetails employeeDetails;
	
	private AttendanceDetails attendance;

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

	public EmployeeDetails getEmployeeDetails() {
		return employeeDetails;
	}

	public void setEmployeeDetails(EmployeeDetails employeeDetails) {
		this.employeeDetails = employeeDetails;
	}

	public AttendanceDetails getAttendance() {
		return attendance;
	}

	public void setAttendance(AttendanceDetails attendance) {
		this.attendance = attendance;
	}
	
	
	
	
}
