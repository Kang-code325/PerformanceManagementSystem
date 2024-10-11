package com.wk.system.service;

import com.wk.system.dao.AttendanceDao;
import com.wk.system.dao.Work_logsDao;
import com.wk.system.domain.Attendance;
import com.wk.system.domain.Work_logs;

import java.sql.SQLException;
import java.sql.Time;
import java.util.List;

public class AttendanceService {
    public List<Attendance> userAttendanceInfo(String employee_id) throws SQLException {
        AttendanceDao attendanceDao = new AttendanceDao();
        return attendanceDao.getAttendanceAll(employee_id);
    }

    public int addDaKaInfo(String employee_id, Time time, String approval) throws SQLException {
        AttendanceDao attendanceDao = new AttendanceDao();
        int rows = attendanceDao.addDaKa(employee_id, time, approval);
        return rows;
    }

    public int addLeaveInfo(String employee_id, String leave, String approval) throws SQLException {
        AttendanceDao attendanceDao = new AttendanceDao();
        int rows = attendanceDao.addLeave(employee_id, leave, approval);
        return rows;
    }


    // 获取分页的考勤信息
    public List<Attendance> getAttendanceListByPage(int pageNum, int pageSize) throws SQLException{
        AttendanceDao attendanceDao = new AttendanceDao();
        int offset = (pageNum - 1) * pageSize;
        return attendanceDao.getAttendanceListByPage(offset, pageSize);
    }

    // 获取考勤总记录数
    public int getTotalAttendanceCount() throws SQLException{
        AttendanceDao attendanceDao = new AttendanceDao();
        return attendanceDao.getTotalAttendanceCount();
    }

    // 添加考勤记录
    public void addAttendance(Attendance attendance) throws SQLException{
        AttendanceDao attendanceDao = new AttendanceDao();
        attendanceDao.addAttendance(attendance);
    }

    // 更新考勤记录
    public void updateAttendance(Attendance attendance) throws SQLException{
        AttendanceDao attendanceDao = new AttendanceDao();
        attendanceDao.updateAttendance(attendance);
    }

    // 删除考勤记录
    public void deleteAttendance(int id) throws SQLException{
        AttendanceDao attendanceDao = new AttendanceDao();
        attendanceDao.deleteAttendance(id);
    }

}
