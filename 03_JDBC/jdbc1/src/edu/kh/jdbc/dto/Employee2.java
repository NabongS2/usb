package edu.kh.jdbc.dto;

public class Employee2 {
	// 부서명, 직급명, 이름, 이메일
	private String deptName;
	private String jobName;
	private String Name;
	private String email;
	
	public Employee2() {
	}
	

	public Employee2(String deptName, String jobName, String name, String email) {
		this.deptName = deptName;
		this.jobName = jobName;
		this.Name = name;
		this.email = email;
	}


	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
