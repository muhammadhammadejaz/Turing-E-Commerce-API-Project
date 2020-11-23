package com.example.turingecommerceapiproject.service;

import com.example.turingecommerceapiproject.model.Department;
import com.example.turingecommerceapiproject.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Object[] getDepartments()
    {
        Iterable<Department> iterable = departmentRepository.findAll();
        List<Department> departments = new ArrayList<>();
        iterable.forEach(departments::add);
        return departments.toArray();
    }

    
    public Department getDepartmentById(Integer Id)
    {
        Optional<Department> option = departmentRepository.findById(Id);
        Department department = option.get();
        return department;
    }
}
