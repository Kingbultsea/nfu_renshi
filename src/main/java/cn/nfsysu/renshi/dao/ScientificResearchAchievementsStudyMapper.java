package cn.nfsysu.renshi.dao;

import cn.nfsysu.renshi.domain.ScientificResearchAchievementsStudy;
import cn.nfsysu.renshi.domain.ScientificResearchAchievementsStudyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScientificResearchAchievementsStudyMapper {
    long countByExample(ScientificResearchAchievementsStudyExample example);

    int deleteByExample(ScientificResearchAchievementsStudyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ScientificResearchAchievementsStudy record);

    int insertSelective(ScientificResearchAchievementsStudy record);

    List<ScientificResearchAchievementsStudy> selectByExample(ScientificResearchAchievementsStudyExample example);

    ScientificResearchAchievementsStudy selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ScientificResearchAchievementsStudy record, @Param("example") ScientificResearchAchievementsStudyExample example);

    int updateByExample(@Param("record") ScientificResearchAchievementsStudy record, @Param("example") ScientificResearchAchievementsStudyExample example);

    int updateByPrimaryKeySelective(ScientificResearchAchievementsStudy record);

    int updateByPrimaryKey(ScientificResearchAchievementsStudy record);
}