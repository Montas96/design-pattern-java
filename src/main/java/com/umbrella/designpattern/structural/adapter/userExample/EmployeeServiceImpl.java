package com.umbrella.designpattern.structural.adapter.userExample;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl {

    public List<Employee> getEmployee() {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("EMPLOYEE-1", new User("EMPLOYEE-1", "EMPLOYEE")));
        employees.add(new Employee("EMPLOYEE-2", new User("EMPLOYEE-2", "EMPLOYEE")));
        employees.add(new Employee("EMPLOYEE-3", new User("EMPLOYEE-3", "EMPLOYEE")));
        return employees;
    }


}
