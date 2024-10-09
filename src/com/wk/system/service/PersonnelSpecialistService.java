package com.wk.system.service;


import com.wk.system.dao.PersonnelSpecialistDao;

import com.wk.system.domain.PersonnelSpecialist;

import java.sql.SQLException;

public class PersonnelSpecialistService {
    public PersonnelSpecialist login(String specialist_id, String password) throws SQLException {
        PersonnelSpecialistDao personnelSpecialistDao = new PersonnelSpecialistDao();
        PersonnelSpecialist personnelSpecialist = personnelSpecialistDao.getPersonnelSpecialist(specialist_id, password);
        return personnelSpecialist;
    }
}
