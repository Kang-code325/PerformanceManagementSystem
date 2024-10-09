package com.wk.system.domain;


/*
* 绩效（人事）专员信息：
* id            id                （自动获取）
* 专员工号        specialist_id
* 姓名           name
* 密码           password
* */
public class PersonnelSpecialist {
    private int id;

    private String specialist_id;

    private String name;

    private  String password;

    public PersonnelSpecialist() {
    }

    public PersonnelSpecialist(int id, String specialist_id,String name , String password) {
        this.id = id;
        this.specialist_id = specialist_id;
        this.name = name;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpecialist_id() {
        return specialist_id;
    }

    public void setSpecialist_id(String specialist_id) {
        this.specialist_id = specialist_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PersonnelSpecialist{" +
                "id=" + id +
                ", specialist_id=" + specialist_id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
