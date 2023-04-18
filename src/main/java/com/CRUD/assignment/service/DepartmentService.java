package com.CRUD.assignment.service;

import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.CRUD.assignment.entity.Department;

import com.CRUD.assignment.service.DepartmentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DepartmentService {
    Department saveDepartment(Department department);

    
    List<Department> fetchDepartmentList();

    
    Department updateDepartment(Department department,
                                Long departmentId);

  
    void deleteDepartmentById(Long departmentId);
}
