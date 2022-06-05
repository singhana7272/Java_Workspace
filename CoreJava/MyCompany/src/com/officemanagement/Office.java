package com.officemanagement;

import com.employee.Address;
import com.employee.Employee;
import com.employee.EmployeeList;
import com.employee.Insurance;

public class Office {

	public static void main(String[] args) {
		
		EmployeeList employees=new EmployeeList();
		Insurance ins=new Insurance("incurance.co",234,12345677);
		Address add=new Address(5,"Awas Vikas Hanpspuram","Uttar Pratesh","India",208021);
		
		Employee umesh=new Employee("Umesh",123,1000,11,null,add,ins);
		employees.addEmployee(umesh);
        Employee abinash=new Employee("Abinash",456,2000,22,umesh,add,ins);
        employees.addEmployee(abinash);
		Employee john=new Employee("John",1,100,12,umesh,add,ins);
		Employee peter=new Employee("Peter",2,200,34,umesh,add,ins);
        Employee kevin=new Employee("Kevin",3,300,56,abinash,add,ins);
		Employee sara=new Employee("Sara",4,400,78,abinash,add,ins);
		employees.addEmployee(john);
		employees.addEmployee(peter);
		employees.addEmployee(kevin);
		employees.addEmployee(sara);
		
		
//        System.out.println(umesh.getDetails(123, 11));
//        System.out.println(abinash.getDetails(456, 22));
//		System.out.println(peter.getDetails(2, 34));
//		System.out.println(kevin.getDetails(3, 56));
//		System.out.println(sara.getDetails(4, 78));
//		System.out.println(john.getDetails(1, 12));
		
		employees.getList();	
	}
}
