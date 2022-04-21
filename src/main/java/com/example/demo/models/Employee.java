package com.example.demo.models;


import java.util.Date;

public class Employee {

    private String employeeId;
    private String name;
    private String job;
    private int manager;
    private int salary;
    private int commission;
    private int department;

    public Employee(String employeeId,String name, String job, int manager, int salary, int commission, int department) {
        this.employeeId = employeeId;
        this.name = name;
        this.job = job;
        this.manager = manager;
        this.salary = salary;
        this.commission = commission;
        this.department = department;
    }

    public String getEmployeeId(){
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public int getManager() {
        return manager;
    }




    public int getSalary() {
        return salary;
    }

    public int getCommission() {
        return commission;
    }

    public int getDepartment() {
        return department;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setManager(int manager) {
        this.manager = manager;
    }


    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setCommission(int commission) {
        this.commission = commission;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employee ID=" + employeeId +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", manager=" + manager +
                ", salary=" + salary +
                ", commission=" + commission +
                ", department=" + department +
                '}';
    }
}
