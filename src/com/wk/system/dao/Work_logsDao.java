package com.wk.system.dao;

import com.wk.system.domain.Performance;
import com.wk.system.domain.Work_logs;
import com.wk.system.utils.C3P0Utils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class Work_logsDao {
    public List<Work_logs> getWork_logsAll(String employee_id) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
        String sql = "select * from work_logs where employee_id = ?";
        return queryRunner.query(sql, new BeanListHandler<>(Work_logs.class), employee_id);
    }
    public int addWork_logs(String employee_id, String logs) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
        String sql = "INSERT INTO work_logs (employee_id, logs) VALUES (?,?)";
        int rowsAffected = queryRunner.update(sql, employee_id, logs);
        return rowsAffected;
    }

}
