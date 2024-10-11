package com.wk.system.dao;

import com.wk.system.domain.Employee;
import com.wk.system.domain.Performance;
import com.wk.system.domain.Work_logs;
import com.wk.system.utils.C3P0Utils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class PerformanceDao {
    public List<Performance> getPerformanceAll(String employee_id) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
        String sql = "select * from performance where employee_id = ?";
        return queryRunner.query(sql, new BeanListHandler<>(Performance.class), employee_id);
    }

    public int updatePerformance(String id, String progress) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
        String sql = "UPDATE performance SET progress = ? WHERE id = ?";
        int rowsAffected = queryRunner.update(sql, progress, id);
        return rowsAffected;
    }

    public Performance getOnePerformance(String id) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
        String sql = "select * from performance where id = ?";
        return queryRunner.query(sql, new BeanHandler<>(Performance.class), id);
    }


    public int updateAdminPerformance(String id, String employee_id, String work, String score, String appraise) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
        // SQL 语句，更新多个字段
        String sql = "UPDATE performance SET employee_id = ?, work = ?, score = ?, appraise = ? WHERE id = ?";
        // 执行更新，并将影响的行数返回
        int rowsAffected = queryRunner.update(sql, employee_id, work, score, appraise, id);
        return rowsAffected;
    }

    public Performance getOneAdminPerformance(String id) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
        String sql = "select * from performance where id = ?";
        return queryRunner.query(sql, new BeanHandler<>(Performance.class), id);
    }

    public List<Performance> getAllPerformance() throws SQLException {
        QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
        String sql = "select * from performance";
        return queryRunner.query(sql, new BeanListHandler<>(Performance.class));
    }


    public int addAdminPerformance(String employee_id, String work, String score, String appraise) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
        // SQL 语句，更新多个字段
        String sql = "INSERT INTO performance (employee_id, work, score, appraise) VALUES (?, ?, ?, ?)";
        // 执行更新，并将影响的行数返回
        int rowsAffected = queryRunner.update(sql, employee_id, work, score, appraise);
        return rowsAffected;
    }

}
