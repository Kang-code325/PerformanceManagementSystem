package com.wk.system.service;

import com.wk.system.dao.EmployeeDao;
import com.wk.system.domain.Employee;

import java.sql.SQLException;
import java.util.List;

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

    public Employee userinfo(String employee_id) throws SQLException {
        EmployeeDao employeeDao = new EmployeeDao();
        Employee employee = employeeDao.getEmployeeAll(employee_id);
        return employee;
    }
    public List<Employee> userinfos() throws SQLException {
        // 创建DAO实例
        EmployeeDao employeeDao = new EmployeeDao();

        // 调用DAO层方法获取 Employee 列表
        List<Employee> employees = employeeDao.getAllEmployees();

        // 返回结果
        return employees;
    }



}
