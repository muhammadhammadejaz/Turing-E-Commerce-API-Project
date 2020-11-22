package com.example.turingecommerceapiproject.model;

public class Department {

    private Integer department_id;
    private String name;
    private String description;

    public Department(Integer department_id, String name, String description)
    {
        this.department_id = department_id;
        this.name = name;
        this.description = description;
    }

    public Integer getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(Integer department_id) {
        this.department_id = department_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
