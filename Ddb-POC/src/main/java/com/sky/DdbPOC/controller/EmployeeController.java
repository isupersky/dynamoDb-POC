package com.sky.DdbPOC.controller;

import com.sky.DdbPOC.common.ResponseDTO;
import com.sky.DdbPOC.entity.Employee;
import com.sky.DdbPOC.repository.EmployeeRepository;
import com.sky.DdbPOC.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService service;

    @PostMapping
    public ResponseDTO saveEmployee(@RequestBody Employee employee){
        return service.save(employee);
    }

    @GetMapping("/{id}")
    public ResponseDTO getEmployee(@PathVariable("id") String id){
        return service.getEmployee(id);
    }

    @PutMapping
    public ResponseDTO updateEmployee(@RequestBody Employee employee){
        return service.updateEmployee(employee);
    }

    @DeleteMapping("/{id}")
    public ResponseDTO deleteEmployee(@PathVariable("id") String id){
        return service.deleteEmployee(id);
    }

}
