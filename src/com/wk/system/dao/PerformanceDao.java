package com.wk.system.dao;

import com.wk.system.domain.Employee;
import com.wk.system.domain.Performance;
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

}
