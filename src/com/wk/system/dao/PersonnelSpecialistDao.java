package com.wk.system.dao;

import com.wk.system.domain.Employee;
import com.wk.system.domain.PersonnelSpecialist;
import com.wk.system.domain.Work_logs;
import com.wk.system.utils.C3P0Utils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

public class PersonnelSpecialistDao {
    private static QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());

    //管理员数据库操作
    public PersonnelSpecialist getPersonnelSpecialist(String specialist_id, String password) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
        String sql = "select * from personnelspecialist where specialist_id = ? and password = ?";
        PersonnelSpecialist personnelSpecialist = queryRunner.query(sql, new BeanHandler<>(PersonnelSpecialist.class), specialist_id, password);
        return personnelSpecialist;
    }

    public int addPersonnelSpecialist(String specialist_id, String name, String password) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
        String sql = "INSERT INTO personnelspecialist (specialist_id, name, password) VALUES (?, ?, ?)";
        int rowsAffected = queryRunner.update(sql, specialist_id, name, password);
        return rowsAffected;
    }

    public PersonnelSpecialist getPersonnelSpecialistAll(String specialist_id) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
        String sql = "select * from personnelspecialist where specialist_id = ?";
        PersonnelSpecialist personnelSpecialist = queryRunner.query(sql, new BeanHandler<>(PersonnelSpecialist.class), specialist_id);
        return personnelSpecialist;
    }

    public List<PersonnelSpecialist> getAllPersonnelSpecialists() throws SQLException {
        QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
        String sql = "select * from personnelspecialist";
        return queryRunner.query(sql, new BeanListHandler<>(PersonnelSpecialist.class));
    }

    // 分页查询管理员列表
    public List<PersonnelSpecialist> getAdminListByPage(int pageNum, int pageSize) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
        String sql = "SELECT * FROM personnelspecialist LIMIT ?, ?";

        // 计算偏移量 (offset)
        int offset = (pageNum - 1) * pageSize;

        // 执行查询，使用 BeanListHandler 将结果转换为 PersonnelSpecialist 对象列表
        List<PersonnelSpecialist> adminList = queryRunner.query(sql, new BeanListHandler<>(PersonnelSpecialist.class), offset, pageSize);

        return adminList;
    }

    // 获取管理员总数
    public int getTotalCount() throws SQLException {
        QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
        String sql = "SELECT COUNT(*) FROM personnelspecialist";

        // 使用 ScalarHandler 来获取单个值 (总记录数)
        Long totalCount = queryRunner.query(sql, new ScalarHandler<>());

        return totalCount.intValue();
    }

    // 添加专员
    public void addPersonnelSpecialist(PersonnelSpecialist personnelSpecialist) {
        QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
        String sql = "INSERT INTO personnelspecialist (specialist_id, name, password) VALUES (?, ?, ?)";
        try {
            queryRunner.update(sql, personnelSpecialist.getSpecialist_id(), personnelSpecialist.getName(), personnelSpecialist.getPassword());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 更新专员
    public void updatePersonnelSpecialist(PersonnelSpecialist personnelSpecialist) {
        QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
        String sql = "UPDATE personnelspecialist SET specialist_id = ?, name = ?, password = ? WHERE id = ?";
        try {
            queryRunner.update(sql, personnelSpecialist.getSpecialist_id(), personnelSpecialist.getName(), personnelSpecialist.getPassword(), personnelSpecialist.getId());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 删除专员
    public void deletePersonnelSpecialist(int id) {
        QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
        String sql = "DELETE FROM personnelspecialist WHERE id = ?";
        try {
            queryRunner.update(sql, id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public PersonnelSpecialist getOnePersonnelSpecialist(String id) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
        String sql = "select * FROM personnelspecialist WHERE id = ?";
        return queryRunner.query(sql, new BeanHandler<>(PersonnelSpecialist.class), id);
    }

}
