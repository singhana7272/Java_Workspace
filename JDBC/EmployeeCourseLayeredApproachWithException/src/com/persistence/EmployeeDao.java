package com.persistence;

import com.beans.Employee;
import com.exception.EmployeeNotFoundException;

public interface EmployeeDao {

	Employee getEmployeeById(int employeeId) throws EmployeeNotFoundException;

}
