package com.example.turingecommerceapiproject.repositories;

import com.example.turingecommerceapiproject.model.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends CrudRepository<Department,Integer> {
}
