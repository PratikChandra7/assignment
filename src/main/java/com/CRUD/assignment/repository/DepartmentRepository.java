package com.CRUD.assignment.repository;

import com.CRUD.assignment.entity.Department;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;


@Repository
public interface DepartmentRepository extends CrudRepository<Department, Long>{
}
