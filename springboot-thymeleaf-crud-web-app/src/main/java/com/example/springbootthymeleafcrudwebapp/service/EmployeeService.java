package com.example.springbootthymeleafcrudwebapp.service;

import java.util.List;

import com.example.springbootthymeleafcrudwebapp.model.Employee;

public interface EmployeeService {
    List < Employee > getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
}