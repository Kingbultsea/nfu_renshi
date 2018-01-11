package cn.nfsysu.renshi.dao;

import cn.nfsysu.renshi.domain.ScientificResearchAchievementsProject;
import cn.nfsysu.renshi.domain.ScientificResearchAchievementsProjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScientificResearchAchievementsProjectMapper {
    long countByExample(ScientificResearchAchievementsProjectExample example);

    int deleteByExample(ScientificResearchAchievementsProjectExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ScientificResearchAchievementsProject record);

    int insertSelective(ScientificResearchAchievementsProject record);

    List<ScientificResearchAchievementsProject> selectByExample(ScientificResearchAchievementsProjectExample example);

    ScientificResearchAchievementsProject selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ScientificResearchAchievementsProject record, @Param("example") ScientificResearchAchievementsProjectExample example);

    int updateByExample(@Param("record") ScientificResearchAchievementsProject record, @Param("example") ScientificResearchAchievementsProjectExample example);

    int updateByPrimaryKeySelective(ScientificResearchAchievementsProject record);

    int updateByPrimaryKey(ScientificResearchAchievementsProject record);
}