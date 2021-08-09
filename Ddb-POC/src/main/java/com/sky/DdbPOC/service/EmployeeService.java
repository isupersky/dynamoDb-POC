package com.sky.DdbPOC.service;

import com.sky.DdbPOC.common.ResponseDTO;
import com.sky.DdbPOC.entity.Employee;
import com.sky.DdbPOC.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public ResponseDTO save(Employee employee) {
        return employeeRepository.save(employee);
    }

    public ResponseDTO getEmployee(String empId){
        return employeeRepository.getEmployee(empId);
    }

    public ResponseDTO updateEmployee(Employee employee){
        return employeeRepository.updateEmployee(employee);
    }

    public ResponseDTO deleteEmployee(String empId){
        return employeeRepository.deleteEmployee(empId);
    }
}
