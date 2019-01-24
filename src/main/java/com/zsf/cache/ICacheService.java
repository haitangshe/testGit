package com.zsf.cache;
import java.util.List;
import com.zsf.bo.StudentBo;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

public interface ICacheService {
    final String SERVICED="ICacheService";
    public List<StudentBo> getAllStudent();
    public StudentBo getStudentById(int id);
}
