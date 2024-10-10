package com.wk.system.dao;

import com.wk.system.domain.Employee;
import com.wk.system.domain.PersonnelSpecialist;
import com.wk.system.utils.C3P0Utils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.SQLException;
import java.util.List;

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
    public Employee getEmployeeAll(String employee_id) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
        String sql = "select * from employee where employee_id = ?";
        Employee employee = queryRunner.query(sql, new BeanHandler<>(Employee.class), employee_id);
        return employee;
    }
    public List<Employee> getAllEmployees() throws SQLException {
        QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
        String sql = "select * from employee";
        return queryRunner.query(sql, new BeanListHandler<>(Employee.class));
    }

    // 分页查询员工列表
    public List<Employee> getEmployeeList(int pageNum, int pageSize) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
        String sql = "SELECT * FROM employee LIMIT ?, ?";

        // 计算偏移量 (offset)
        int offset = (pageNum - 1) * pageSize;

        // 执行查询，使用 BeanListHandler 将结果转换为 Employee 对象列表
        List<Employee> employeeList = queryRunner.query(sql, new BeanListHandler<>(Employee.class), offset, pageSize);

        return employeeList;
    }

    // 获取员工总数
    public int getTotalCount() throws SQLException {
        QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
        String sql = "SELECT COUNT(*) FROM employee";

        // 使用 ScalarHandler 来获取单个值 (总记录数)
        Long totalCount = queryRunner.query(sql, new ScalarHandler<>());

        return totalCount.intValue();
    }



}
