package com.sky.DdbPOC.repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.sky.DdbPOC.common.ResponseDTO;
import com.sky.DdbPOC.entity.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import static com.sky.DdbPOC.common.ResponseDTO.failure;
import static com.sky.DdbPOC.common.ResponseDTO.success;
import static java.util.Objects.isNull;

@Repository
public class EmployeeRepository {

    Logger log = LoggerFactory.getLogger(EmployeeRepository.class);

    @Autowired
    DynamoDBMapper mapper;

    public ResponseDTO save(Employee employee) {
        try {
            mapper.save(employee);
            return success(employee);
        } catch (Exception e) {
            log.error("Exception occured: ", e);
            return failure(e.getMessage());
        }
    }

    public ResponseDTO getEmployee(String empId) {
        try {
            Employee employee = mapper.load(Employee.class, empId);
            return isNull(employee) ? failure("No such Employee found") : success(employee);
        } catch (Exception e) {
            return failure(e.getMessage());
        }
    }

    public ResponseDTO updateEmployee(Employee employee) {
        try {
            Employee emp = getEmployee(employee.getEmpId()).getData();
            if (!isNull(emp)) {
                return save(employee);
            }
            return failure("No such Employee found");
        } catch (Exception e) {
            return failure(e.getMessage());
        }
    }

    public ResponseDTO deleteEmployee(String empId) {
        try {
            Employee employee = getEmployee(empId).getData();
            if (!isNull(employee)) {
                mapper.delete(employee);
                return success(employee);
            }
            return failure("No such Employee found");
        } catch (Exception e) {
            return failure(e.getMessage());
        }
    }
}
