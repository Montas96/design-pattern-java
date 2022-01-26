package com.umbrella.designpattern.structural.composite.employeeExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BankManager implements Employee {

    private final int id;
    private final String name;
    private final double salary;
    List<Employee> employees = new ArrayList<>();

    public BankManager(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void add(Employee employee) {
        employees.add(employee);
    }

    @Override
    public Employee getChild(int i) {
        return employees.get(i);
    }

    @Override
    public void remove(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void print() {
        System.out.println("==========================");
        System.out.println("Id =" + getId());
        System.out.println("Name =" + getName());
        System.out.println("Salary =" + getSalary());
        System.out.println("==========================");

        Iterator<Employee> it = employees.iterator();

        while (it.hasNext()) {
            Employee employee = it.next();
            employee.print();
        }
    }
}