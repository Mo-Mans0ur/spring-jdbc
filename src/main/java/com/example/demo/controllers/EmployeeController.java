package com.example.demo.controllers;


import com.example.demo.models.Employee;
import com.example.demo.repositories.EmployeeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

@Controller
public class EmployeeController{
        private EmployeeRepository employeeService = new EmployeeRepository();

    @GetMapping("/employees")
    public String employees(Model transportedData){
        ArrayList<Employee> allEmployees = employeeService.getAllEmployees();
        transportedData.addAttribute("employees",allEmployees);
        return"employees";
    }

    @GetMapping("/addemployee")
    public String addEmployee(){
        return "addemployee";
    }

    @PostMapping("/add-employee-handler")
    public String addEmployeeHandler(
            @RequestParam String employeeId,
            @RequestParam String name,
            @RequestParam String job,
            @RequestParam int manager,
            @RequestParam int salary,
            @RequestParam int commission,
            @RequestParam int department,
            Model model

    ) throws IOException {
        employeeService.addEmployee(new Employee(employeeId,name,job,manager,salary,commission,department));
        return "redirect:/employees";
    }
}
