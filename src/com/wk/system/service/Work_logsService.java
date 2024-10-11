package com.wk.system.service;

import com.wk.system.dao.AttendanceDao;
import com.wk.system.dao.PerformanceDao;
import com.wk.system.dao.Work_logsDao;
import com.wk.system.domain.Performance;
import com.wk.system.domain.Work_logs;

import java.sql.SQLException;
import java.util.List;

public class Work_logsService {
    public List<Work_logs> userWork_logsInfo(String employee_id) throws SQLException {
        Work_logsDao workLogsDao = new Work_logsDao();
        return workLogsDao.getWork_logsAll(employee_id);
    }

    public int addLogs(String employee_id, String logs) throws SQLException {
        Work_logsDao workLogsDao = new Work_logsDao();
        int rows = workLogsDao.addWork_logs(employee_id, logs);
        return rows;
    }
}
