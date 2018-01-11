package cn.nfsysu.renshi.dao;

import cn.nfsysu.renshi.domain.ScientificResearchAchievementsAward;
import cn.nfsysu.renshi.domain.ScientificResearchAchievementsAwardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScientificResearchAchievementsAwardMapper {
    long countByExample(ScientificResearchAchievementsAwardExample example);

    int deleteByExample(ScientificResearchAchievementsAwardExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ScientificResearchAchievementsAward record);

    int insertSelective(ScientificResearchAchievementsAward record);

    List<ScientificResearchAchievementsAward> selectByExample(ScientificResearchAchievementsAwardExample example);

    ScientificResearchAchievementsAward selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ScientificResearchAchievementsAward record, @Param("example") ScientificResearchAchievementsAwardExample example);

    int updateByExample(@Param("record") ScientificResearchAchievementsAward record, @Param("example") ScientificResearchAchievementsAwardExample example);

    int updateByPrimaryKeySelective(ScientificResearchAchievementsAward record);

    int updateByPrimaryKey(ScientificResearchAchievementsAward record);
}