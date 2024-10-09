package com.wk.system.service;

import com.wk.system.dao.EmployeeDao;
import com.wk.system.domain.Employee;

import java.sql.SQLException;

public class EmployeeService {
    public Employee login(String employee_id, String password) throws SQLException {
        EmployeeDao employeeDao = new EmployeeDao();
        Employee employee = employeeDao.getEmployee(employee_id, password);
        return employee;
    }

    public int register(String employee_id,String name, String password, String dep, String job) throws SQLException {
        EmployeeDao employeeDao = new EmployeeDao();
        int rows = employeeDao.addEmployee(employee_id, name,  password, dep, job);
        return rows;
    }

}
