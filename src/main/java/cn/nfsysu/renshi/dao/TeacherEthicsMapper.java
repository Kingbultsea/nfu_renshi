package cn.nfsysu.renshi.dao;

import cn.nfsysu.renshi.domain.TeacherEthics;
import cn.nfsysu.renshi.domain.TeacherEthicsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeacherEthicsMapper {
    long countByExample(TeacherEthicsExample example);

    int deleteByExample(TeacherEthicsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TeacherEthics record);

    int insertSelective(TeacherEthics record);

    List<TeacherEthics> selectByExample(TeacherEthicsExample example);

    TeacherEthics selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TeacherEthics record, @Param("example") TeacherEthicsExample example);

    int updateByExample(@Param("record") TeacherEthics record, @Param("example") TeacherEthicsExample example);

    int updateByPrimaryKeySelective(TeacherEthics record);

    int updateByPrimaryKey(TeacherEthics record);
}