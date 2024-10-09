package com.wk.system.domain;

import java.sql.Date;

/*
* 工作记录模块：
* id            id              （自动获取）
* 员工工号        employee_id
* 日期           date            （自动获取）
* 生活日志        logs
* */
public class Work_logs {
    private int id;

    private String employee_id;

    private Date date;

    private String logs;

    public Work_logs() {
    }

    public Work_logs(int id, String employee_id, Date date, String logs) {
        this.id = id;
        this.employee_id = employee_id;
        this.date = date;
        this.logs = logs;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLogs() {
        return logs;
    }

    public void setLogs(String logs) {
        this.logs = logs;
    }

    @Override
    public String toString() {
        return "Work_logs{" +
                "id=" + id +
                ", employee_id=" + employee_id +
                ", date=" + date +
                ", logs='" + logs + '\'' +
                '}';
    }
}
