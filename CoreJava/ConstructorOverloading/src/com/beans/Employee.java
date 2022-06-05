package com.beans;

public class Employee {
	private String empName;
	private int empId;
	private int empAge;
	private String empdesgn;
	private String empLocation;
	private int empExpInYrs;
	
	public Employee(String empName) {
		this.empName = empName;
	}

	public Employee(String empName, int empId) {
		this(empName);
		this.empId = empId;
	}

	public Employee(String empName, int empId, int empAge) {
		this(empName,empId);
		this.empAge = empAge;
	}

	public Employee(String empName, int empId, String empdesgn) {
		this(empName,empId);
		this.empdesgn = empdesgn;
	}
    
	
	public Employee(String empName, int empId, int empAge, int empExpInYrs) {
		this(empName,empId,empAge);
		this.empExpInYrs = empExpInYrs;
	}

	public Employee(String empName, int empId, int empAge, String empLocation) {
		this(empName,empId,empAge);
		this.empLocation = empLocation;
	}

	public Employee(String empName, int empId, String empdesgn, int empExpInYrs) {
		this(empName,empId,empdesgn);
		this.empExpInYrs = empExpInYrs;
	}

	public Employee(String empName, int empId, String empdesgn, String empLocation, int empExpInYrs) {
		this(empName,empId,empdesgn,empExpInYrs);
		this.empLocation = empLocation;
	}

	public Employee(String empName, int empId, int empAge, String empdesgn, String empLocation, int empExpInYrs) {
		this(empName,empId,empdesgn,empLocation,empExpInYrs);
		this.empAge = empAge;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", empAge=" + empAge + ", empdesgn=" + empdesgn
				+ ", empLocation=" + empLocation + ", empExpInYrs=" + empExpInYrs + "]";
	}
	
		
	
}
