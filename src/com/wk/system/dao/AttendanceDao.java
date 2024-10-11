package com.wk.system.dao;

import com.wk.system.domain.Attendance;
import com.wk.system.domain.Work_logs;
import com.wk.system.utils.C3P0Utils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

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
    public List<Attendance> getAttendanceListByPage(int offset, int pageSize) {
        QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
        String sql = "SELECT * FROM attendance LIMIT ?, ?";
        try {
            return queryRunner.query(sql, new BeanListHandler<>(Attendance.class), offset, pageSize);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    // 获取考勤记录总数
    public int getTotalAttendanceCount() {
        QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
        String sql = "SELECT COUNT(*) FROM attendance";
        try {
            Long count = queryRunner.query(sql, new ScalarHandler<>());
            return count.intValue();  // 将 Long 转换为 int
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    // 添加考勤记录
    public void addAttendance(Attendance attendance) {
        QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
        String sql = "INSERT INTO attendance (employee_id, date, time, `leave`, approval) VALUES (?, ?, ?, ?, ?)";
        Object[] params = {
                attendance.getEmployee_id(),
                attendance.getDate(),
                attendance.getTime(),
                attendance.getLeave(),
                attendance.getApproval()
        };
        try {
            queryRunner.update(sql, params);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 更新考勤记录
    public void updateAttendance(Attendance attendance) {
        QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
        String sql = "UPDATE attendance SET employee_id = ?, date = ?, time = ?, leave = ?, approval = ? WHERE id = ?";
        Object[] params = {
                attendance.getEmployee_id(),
                attendance.getDate(),
                attendance.getTime(),
                attendance.getLeave(),
                attendance.getApproval(),
                attendance.getId()
        };
        try {
            queryRunner.update(sql, params);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 删除考勤记录
    public void deleteAttendance(int id) {
        QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
        String sql = "DELETE FROM attendance WHERE id = ?";
        try {
            queryRunner.update(sql, id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



}
