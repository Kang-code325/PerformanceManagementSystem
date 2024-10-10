package com.wk.system.dao;

import com.wk.system.domain.Employee;
import com.wk.system.domain.PersonnelSpecialist;
import com.wk.system.utils.C3P0Utils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class PersonnelSpecialistDao {
    //管理员数据库操作
    public PersonnelSpecialist getPersonnelSpecialist(String specialist_id, String password) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
        String sql = "select * from personnelspecialist where specialist_id = ? and password = ?";
        PersonnelSpecialist personnelSpecialist = queryRunner.query(sql, new BeanHandler<>(PersonnelSpecialist.class), specialist_id, password);
        return personnelSpecialist;
    }

    public int addPersonnelSpecialist(String specialist_id, String name, String password) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
        String sql = "INSERT INTO personnelspecialist (specialist_id, name, password) VALUES (?, ?, ?)";
        int rowsAffected = queryRunner.update(sql, specialist_id, name, password);
        return rowsAffected;
    }
    public PersonnelSpecialist getPersonnelSpecialistAll(String specialist_id) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
        String sql = "select * from personnelspecialist where specialist_id = ?";
        PersonnelSpecialist personnelSpecialist = queryRunner.query(sql, new BeanHandler<>(PersonnelSpecialist.class), specialist_id);
        return personnelSpecialist;
    }

    public List<PersonnelSpecialist> getAllPersonnelSpecialists() throws SQLException {
        QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
        String sql = "select * from personnelspecialist";
        return queryRunner.query(sql, new BeanListHandler<>(PersonnelSpecialist.class));
    }


}
