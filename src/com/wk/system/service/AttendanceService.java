package com.wk.system.service;

import com.wk.system.dao.AttendanceDao;
import com.wk.system.dao.Work_logsDao;
import com.wk.system.domain.Attendance;
import com.wk.system.domain.Work_logs;

import java.sql.SQLException;
import java.util.List;

public class AttendanceService {
    public List<Attendance> userAttendanceInfo(String employee_id) throws SQLException {
        AttendanceDao attendanceDao = new AttendanceDao();
        return attendanceDao.getAttendanceAll(employee_id);
    }
}
