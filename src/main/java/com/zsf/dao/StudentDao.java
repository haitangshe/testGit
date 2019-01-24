package com.zsf.dao;
import java.util.List;
import com.zsf.bo.StudentBo;
public interface StudentDao {
    int deleteByPrimaryKey(Integer id);
    int insert(StudentBo record);
    int insertSelective(StudentBo record);
    StudentBo selectByPrimaryKey(Integer id);

    List<StudentBo> selectAllStudent();

    int updateByPrimaryKeySelective(StudentBo record);

    int updateByPrimaryKey(StudentBo record);
}
