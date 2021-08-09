package com.sky.DdbPOC.dto;


public class EmployeeDTO {

    private String empId;
    private String firstName;
    private String lastName;
    private String designation;

    public EmployeeDTO(String empId, String firstName, String lastName, String designation) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.designation = designation;
    }

    public EmployeeDTO() {
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
