package com.wk.system.domain;


import java.sql.Timestamp;
import java.time.LocalDateTime;

/*
* 员工绩效信息：
* id                id              （自动添加）
* 员工工号            employee_id
* 工作内容            work            （这个应该绩效专员设置）
* 完成进度            progress        （这个应该员工设置）
* 绩效评分            score           （这个应该绩效专员设置）
* 评价               appraise        （这个应该绩效专员设置）
* 任务发布时间         time            （自动获取）
* */
public class Performance {
    private int id;

    private String employee_id;

    private String work;

    private String progress;

    private double score;

    private String appraise;

    private Timestamp time;

    public Performance() {
    }

    public Performance(int id, String employee_id,String work ,String progress ,double score, String appraise, Timestamp time) {
        this.id = id;
        this.employee_id = employee_id;
        this.work = work;
        this.progress = progress;
        this.score = score;
        this.appraise = appraise;
        this.time = time;
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

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getAppraise() {
        return appraise;
    }

    public void setAppraise(String appraise) {
        this.appraise = appraise;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    @Override
    public String toString() {
        return "Performance{" +
                "id=" + id +
                ", employee_id=" + employee_id +
                ", work='" + work + '\'' +
                ", progress='" + progress + '\'' +
                ", score=" + score +
                ", appraise='" + appraise + '\'' +
                ", time=" + time +
                '}';
    }

}
