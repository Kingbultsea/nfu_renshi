package cn.nfsysu.renshi.dao;

import cn.nfsysu.renshi.domain.TeacherQualification;
import cn.nfsysu.renshi.domain.TeacherQualificationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeacherQualificationMapper {
    long countByExample(TeacherQualificationExample example);

    int deleteByExample(TeacherQualificationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TeacherQualification record);

    int insertSelective(TeacherQualification record);

    List<TeacherQualification> selectByExample(TeacherQualificationExample example);

    TeacherQualification selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TeacherQualification record, @Param("example") TeacherQualificationExample example);

    int updateByExample(@Param("record") TeacherQualification record, @Param("example") TeacherQualificationExample example);

    int updateByPrimaryKeySelective(TeacherQualification record);

    int updateByPrimaryKey(TeacherQualification record);
}