package com.wk.system.dao;

import com.wk.system.domain.Employee;
import com.wk.system.utils.C3P0Utils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

public class EmployeeDao {
    //根据 工号，密码获取员工类信息
    public Employee getEmployee(String employee_id, String password) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
        String sql = "select * from employee where employee_id = ? and password = ?";
        Employee employee = queryRunner.query(sql, new BeanHandler<>(Employee.class), employee_id, password);
        return employee;
    }
    public int addEmployee(String employee_id, String name, String password, String dep, String job) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
        String sql = "INSERT INTO employee (employee_id, name, password, dep, job) VALUES (?, ?, ?, ?, ?)";
        int rowsAffected = queryRunner.update(sql, employee_id, name, password, dep, job);
        return rowsAffected;
    }


}
