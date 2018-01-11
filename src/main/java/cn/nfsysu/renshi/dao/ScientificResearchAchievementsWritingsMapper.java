package cn.nfsysu.renshi.dao;

import cn.nfsysu.renshi.domain.ScientificResearchAchievementsWritings;
import cn.nfsysu.renshi.domain.ScientificResearchAchievementsWritingsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScientificResearchAchievementsWritingsMapper {
    long countByExample(ScientificResearchAchievementsWritingsExample example);

    int deleteByExample(ScientificResearchAchievementsWritingsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ScientificResearchAchievementsWritings record);

    int insertSelective(ScientificResearchAchievementsWritings record);

    List<ScientificResearchAchievementsWritings> selectByExample(ScientificResearchAchievementsWritingsExample example);

    ScientificResearchAchievementsWritings selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ScientificResearchAchievementsWritings record, @Param("example") ScientificResearchAchievementsWritingsExample example);

    int updateByExample(@Param("record") ScientificResearchAchievementsWritings record, @Param("example") ScientificResearchAchievementsWritingsExample example);

    int updateByPrimaryKeySelective(ScientificResearchAchievementsWritings record);

    int updateByPrimaryKey(ScientificResearchAchievementsWritings record);
}