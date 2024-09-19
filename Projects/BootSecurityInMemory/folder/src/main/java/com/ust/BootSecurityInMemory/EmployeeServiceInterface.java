package com.ust.BootSecurityInMemory;

import java.util.List;

public interface EmployeeServiceInterface {
    List<Employee> findAll();
    List<Employee> findByDescription(String description);
    Employee findById(int id);
}