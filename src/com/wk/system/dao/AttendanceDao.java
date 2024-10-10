package com.wk.system.dao;

import com.wk.system.domain.Attendance;
import com.wk.system.domain.Work_logs;
import com.wk.system.utils.C3P0Utils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class AttendanceDao {
    public List<Attendance> getAttendanceAll(String employee_id) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
        String sql = "select * from attendance where employee_id = ?";
        return queryRunner.query(sql, new BeanListHandler<>(Attendance.class), employee_id);
    }
}
