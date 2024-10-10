package com.wk.system.service;


import com.wk.system.dao.EmployeeDao;
import com.wk.system.dao.PersonnelSpecialistDao;

import com.wk.system.domain.Employee;
import com.wk.system.domain.PersonnelSpecialist;

import java.sql.SQLException;

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
}
