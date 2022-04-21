package com.example.demo.repositories;

import com.example.demo.models.Employee;
import com.example.demo.utility.DatabaseConnectionManager;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeRepository{

    public ArrayList<Employee> getAllEmployees(){
        ArrayList<Employee> allEmployees= new ArrayList<Employee>();

        PreparedStatement prepstmt;
        ResultSet rs;
        try{
        prepstmt = DatabaseConnectionManager.getConnection().prepareStatement("SELECT * FROM employee_departments.employee");
        rs = prepstmt.executeQuery();

        while(rs.next()) {
            Employee employee = new Employee(
            rs.getString(1),
            rs.getString(2),
            rs.getString(3),
            rs.getInt(4),
            rs.getInt(5),
            rs.getInt(6),
            rs.getInt(7)
            );
            allEmployees.add(employee);
        }

        }catch(SQLException throwables){
            System.out.println("nope Something went wrong");
            throwables.printStackTrace();
        }
        return allEmployees;
    }


    public boolean addEmployee(Employee e) {
        PreparedStatement prepstmt;

        try {
            prepstmt = DatabaseConnectionManager.getConnection().prepareStatement("INSERT INTO employee_departments.employee VALUES (?,?,?,?,?,?,?)");
            prepstmt.setString(1, e.getEmployeeId());
            prepstmt.setString(2, e.getName());
            prepstmt.setString(3, e.getJob());
            prepstmt.setInt(4, e.getManager());
            prepstmt.setInt(5, e.getSalary());
            prepstmt.setInt(6, e.getCommission());
            prepstmt.setInt(7, e.getDepartment());

            prepstmt.executeUpdate();

            prepstmt.close();

            return true;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return false;
        }

    }

}
