package com.wk.system.domain;


import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

//考勤信息
/*
* id                             id               （自动添加）
* 员工工号                         employee_id
* 考勤日期                          date            （自动获取，无需输入）
* 打卡时间                          time            （记得在打卡的时候获取）
* 请假情况                          leave
* 审批人员(名字，手动输入没有外键)     approval
* */
public class Attendance {
    private int id;
    private String employee_id;

    private Date date;

    private Time time;

    private String leave;

    private String approval;


    public Attendance() {
    }

    public Attendance(int id, String employee_id, Date date, Time time, String leave, String approval) {
        this.id = id;
        this.employee_id = employee_id;
        this.date = date;
        this.time = time;
        this.leave = leave;
        this.approval = approval;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getLeave() {
        return leave;
    }

    public void setLeave(String leave) {
        this.leave = leave;
    }

    public String getApproval() {
        return approval;
    }

    public void setApproval(String approval) {
        this.approval = approval;
    }

    public String getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "id=" + id +
                ", employee_id=" + employee_id +
                ", date=" + date +
                ", time=" + time +
                ", leave='" + leave + '\'' +
                ", approval='" + approval + '\'' +
                '}';
    }

}
