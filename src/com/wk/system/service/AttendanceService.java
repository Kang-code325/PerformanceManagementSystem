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

}
