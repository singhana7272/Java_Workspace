package com.employee;

public class Employee {
	private String name;
	private int id;
	private char dept;
	private int salary;
	
	public String getName() {
		return name;
	}


	public int getId() {
		return id;
	}

	private int password;
	private Employee manager;
	private Address address;
	private Insurance insurance;
	
	public Employee(String name, int id,int salary, int password,Employee manager,Address address,Insurance insurance) {
		this.name = name;
		this.id = id;
		this.dept = getdept(salary);
		this.salary = salary;
		this.password = password;
		this.manager=manager;
		this.address=address;
		this.insurance=insurance;
	}

	private char getdept(int salary) {
		if(salary<100) return 'A';
		else if(salary==100) return 'B';
		else return 'C';
	}
	
	public String getDetails(int id,int password){
		char dept='x';
		if(this.password==password && this.id==id) {
			return "Employee [name=" + name + ", id=" + id + ", dept=" + this.dept + ", salary=" + salary + ", password="
					+ password + "\n" + "Manager=" + getManager(manager) + "\n" + "Address= "+ address+ "]" + "\n" + "Insurance=" + insurance ; 
		}
		else return "Invalid employee";
	}
	
//	private String getManager(Employee mng) {
//		return "[name=" + mng.name + ", id=" + mng.id + ", dept=" + mng.dept + ", salary=" + mng.salary + ", password="
//				+ mng.password + "]"; 
//	}
	
	private String getManager(Employee mng) {
		if(mng!=null){
		return "[name=" + mng.name + ", id=" + mng.id + ", dept=" + mng.dept + ", salary=" + mng.salary + ", password="
				+ mng.password + "]"; 
		}
		else {
			return "no manager";
		}
	}

	public int checkSalary(int password,int salary){
		if(this.password==password) {
			return this.salary;
		}
		else return -1;
	}
	
	
	
}
