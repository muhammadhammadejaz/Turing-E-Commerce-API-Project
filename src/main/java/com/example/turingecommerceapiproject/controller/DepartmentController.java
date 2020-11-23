package com.example.turingecommerceapiproject.controller;

import com.example.turingecommerceapiproject.model.Department;
import com.example.turingecommerceapiproject.model.Error;
import com.example.turingecommerceapiproject.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    public ResponseEntity<?> getDepartments()
    {
        Object[] departments = departmentService.getDepartments();
        if (departments.length == 0)
        {
            Error error = new Error();
            error.setCode("USR_02");
            error.setMessage("The field example is empty.");
            error.setField("example");
            error.setStatus("500");
            return new ResponseEntity<Error>(error, HttpStatus.BAD_REQUEST);
        }
        else
        {
            return new ResponseEntity<Object>(departments,HttpStatus.OK);
        }
    }

    @GetMapping("/{department_id}")
    public ResponseEntity<?> getDepartmentById(@PathVariable Integer department_id)
    {
        try
        {
            Department department = departmentService.getDepartmentById(department_id);
            return new ResponseEntity<Department>(department,HttpStatus.OK);
        }
        catch(Exception ex)
        {
            Error error = new Error();
            error.setCode("USR_02");
            error.setMessage("The field example is empty.");
            error.setField("example");
            error.setStatus("500");
            return new ResponseEntity<Error>(error, HttpStatus.BAD_REQUEST);
        }
    }
}
