package cn.nfsysu.renshi.dao;

import cn.nfsysu.renshi.domain.LearningExperience;
import cn.nfsysu.renshi.domain.LearningExperienceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LearningExperienceMapper {
    long countByExample(LearningExperienceExample example);

    int deleteByExample(LearningExperienceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LearningExperience record);

    int insertSelective(LearningExperience record);

    List<LearningExperience> selectByExample(LearningExperienceExample example);

    LearningExperience selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LearningExperience record, @Param("example") LearningExperienceExample example);

    int updateByExample(@Param("record") LearningExperience record, @Param("example") LearningExperienceExample example);

    int updateByPrimaryKeySelective(LearningExperience record);

    int updateByPrimaryKey(LearningExperience record);
}