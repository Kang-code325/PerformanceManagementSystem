package com.wk.system.service;

import com.wk.system.dao.EmployeeDao;
import com.wk.system.dao.PerformanceDao;
import com.wk.system.dao.Work_logsDao;
import com.wk.system.domain.Employee;
import com.wk.system.domain.Performance;
import com.wk.system.domain.Work_logs;

import java.sql.SQLException;
import java.util.List;

public class PerformanceService {
    public List<Performance> userPerformanceInfo(String employee_id) throws SQLException {
        PerformanceDao performanceDao = new PerformanceDao();
//        Performance performance = performanceDao.getPerforamnceAll(employee_id);
        return performanceDao.getPerformanceAll(employee_id);
    }

    public int updateProgress(String id, String progress) throws SQLException {
        PerformanceDao performanceDao = new PerformanceDao();
        int rows = performanceDao.updatePerformance(id, progress);
        return rows;
    }

    public Performance getOneProgress(String id) throws SQLException {
        PerformanceDao performanceDao = new PerformanceDao();
        return performanceDao.getOnePerformance(id);
    }
}
