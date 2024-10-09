package com.wk.system.domain;


/*
* 员工信息：
* id            id              （自动添加）
* 员工工号        employee_id
* 姓名           name
* 密码           password
* 部门           dep
* 职位           job
* */
public class Employee {
    private int id;

    private String employee_id;

    private String name;

    private String password;

    private String dep;

    private String job;

    public Employee() {
    }

    public Employee(int id, String employee_id, String name , String password, String dep, String job) {
        this.id = id;
        this.employee_id = employee_id;
        this.name = name;
        this.password = password;
        this.dep = dep;
        this.job = job;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", employee_id=" + employee_id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", dep='" + dep + '\'' +
                ", job='" + job + '\'' +
                '}';
    }

}
