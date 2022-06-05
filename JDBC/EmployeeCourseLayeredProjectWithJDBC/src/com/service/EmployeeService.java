package com.service;

import com.beans.Employee;
import com.exception.EmployeeNotFoundException;

public interface EmployeeService {

	Employee searchEmployeeById(int employeeId) throws EmployeeNotFoundException;

}
