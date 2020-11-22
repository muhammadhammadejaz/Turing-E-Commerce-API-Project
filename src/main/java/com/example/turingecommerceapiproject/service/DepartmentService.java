package com.example.turingecommerceapiproject.service;

import com.example.turingecommerceapiproject.model.Department;
import com.example.turingecommerceapiproject.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department[] getDepartments()
    {
        Iterable<Department> departments = departmentRepository.findAll();
    }
}
