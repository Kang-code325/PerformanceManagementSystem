package com.wk.system.service;



import com.wk.system.dao.PersonnelSpecialistDao;


import com.wk.system.domain.PersonnelSpecialist;

import java.sql.SQLException;
import java.util.List;

public class PersonnelSpecialistService {
    public PersonnelSpecialist login(String specialist_id, String password) throws SQLException {
        PersonnelSpecialistDao personnelSpecialistDao = new PersonnelSpecialistDao();
        PersonnelSpecialist personnelSpecialist = personnelSpecialistDao.getPersonnelSpecialist(specialist_id, password);
        return personnelSpecialist;
    }
    public int register(String specialist_id,String name, String password) throws SQLException {
        PersonnelSpecialistDao personnelSpecialistDao = new PersonnelSpecialistDao();
        int rows = personnelSpecialistDao.addPersonnelSpecialist(specialist_id, name,  password);
        return rows;
    }
    public PersonnelSpecialist admininfo(String specialist_id) throws SQLException {
        PersonnelSpecialistDao personnelSpecialistDao = new PersonnelSpecialistDao();
        PersonnelSpecialist personnelSpecialist = personnelSpecialistDao.getPersonnelSpecialistAll(specialist_id);
        return personnelSpecialist;
    }
    public List<PersonnelSpecialist> admininfos() throws SQLException {
        // 创建DAO实例
        PersonnelSpecialistDao personnelSpecialistDao = new PersonnelSpecialistDao();

        // 调用DAO层方法获取 PersonnelSpecialist 列表
        List<PersonnelSpecialist> personnelSpecialists = personnelSpecialistDao.getAllPersonnelSpecialists();

        // 返回结果
        return personnelSpecialists;
    }


}
