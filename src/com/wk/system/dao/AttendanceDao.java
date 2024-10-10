package com.wk.system.dao;

import com.wk.system.domain.Attendance;
import com.wk.system.domain.Work_logs;
import com.wk.system.utils.C3P0Utils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.sql.Time;
import java.util.List;

public class AttendanceDao {
    public List<Attendance> getAttendanceAll(String employee_id) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
        String sql = "select * from attendance where employee_id = ?";
        return queryRunner.query(sql, new BeanListHandler<>(Attendance.class), employee_id);
    }
    public int addDaKa(String employee_id, Time time, String approval) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
        String sql = "INSERT INTO attendance (employee_id, time, approval) VALUES (?,?,?)";
        int rowsAffected = queryRunner.update(sql, employee_id, time, approval);
        return rowsAffected;
    }

    public int addLeave(String employee_id, String leave, String approval) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
        String sql = "INSERT INTO attendance (employee_id, `leave`, approval) VALUES (?,?,?)";
        int rowsAffected = queryRunner.update(sql, employee_id, leave, approval);
        return rowsAffected;
    }
}
