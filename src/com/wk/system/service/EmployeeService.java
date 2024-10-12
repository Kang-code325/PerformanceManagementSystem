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
    public List<Employee> userinfoList(int pageNum, int pageSize) throws SQLException {
        EmployeeDao employeeDao = new EmployeeDao();
        // 调用 EmployeeDao 进行分页查询
        List<Employee> employeeList = employeeDao.getEmployeeList(pageNum, pageSize);
        return employeeList;
    }

    // 获取员工总数
    public int getTotalEmployeeCount() throws SQLException {
        EmployeeDao employeeDao = new EmployeeDao();
        // 调用 EmployeeDao 获取总员工数
        return employeeDao.getTotalCount();
    }

    //按钮的增删改

    //
    // 添加员工
    public void addEmployee(Employee employee) {
        // 可以在这里处理业务逻辑，例如校验数据

        EmployeeDao.addEmployee(employee);
    }

    // 更新员工
    public void updateEmployee(Employee employee) {
        // 处理更新逻辑
        EmployeeDao.updateEmployee(employee);
    }

    // 删除员工
    public void deleteEmployee(String Id) {
        // 可以在删除前进行检查
        EmployeeDao.deleteEmployee(Id);
    }

//    // 查询所有员工
//    public List<Employee> getAllEmployees() {
//        return EmployeeDao.getAllEmployees();
//    }

    // 根据ID查询员工
    public Employee getEmployeeById(String id) throws SQLException {
        return EmployeeDao.getEmployeeById(id);
    }

}
