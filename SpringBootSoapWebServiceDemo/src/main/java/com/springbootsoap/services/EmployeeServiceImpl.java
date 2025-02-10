package com.springbootsoap.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootsoap.model.Employee;
import com.springbootsoap.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	 @Autowired
	 EmployeeRepository employeeRepository;
	
	
	@Override
	public Employee getEmployeeById(long employeeId) {
		
		Employee obj = employeeRepository.findByEmployeeId(employeeId);
		return obj;
		
	}

	@Override
	public void AddEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
	public void updateEmployee(Employee employee) {
		employeeRepository.save(employee);

	}

	@Override
	public void deleteEmployee(long employeeId) {
		employeeRepository.deleteById(employeeId);

	}
	
}
