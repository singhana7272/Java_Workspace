package com.employee;

public class EmployeeList {
	private Employee employees[];
	private int index; 

	public EmployeeList() {
		super();
		this.employees = new Employee[10];
		index=0;
	}
	
	
	public void addEmployee(Employee employee) {
		if(index<10) {
		employees[index]=employee;
		index++;
		}
		else System.out.println("Employee list is full we cannot add further employee");
	}
	
//	public void deleteEmployee(Employee employee) {
//		
//	}
	
	public void getList() {
		
		for(Employee e:employees) {
			if(e!=null) 
				System.out.println(e.getName()+" "+e.getId());
			else {
				System.out.println("10 objects are added");
				break;
			}			
		}
	}
	
	
	
 
}
