package com.sky.DdbPOC.common;


import com.sky.DdbPOC.entity.Employee;

public class ResponseDTO {

    private boolean success;
    private Employee data;
    private String error;

    public ResponseDTO(boolean success, Employee data, String error) {
        this.success = success;
        this.data = data;
        this.error = error;
    }

    public ResponseDTO(boolean success, Employee data) {
        this.success = success;
        this.data = data;
    }

    public ResponseDTO(boolean success, String error) {
        this.success = success;
        this.error = error;
    }

    public static <T> ResponseDTO success(Employee data) {
        return new ResponseDTO(true, data);
    }

    public static<T> ResponseDTO failure(String errorMessage){
        return new ResponseDTO(false, errorMessage);
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Employee getData() {
        return data;
    }

    public void setData(Employee data) {
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
