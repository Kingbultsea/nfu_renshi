package cn.nfsysu.renshi.dao;

import cn.nfsysu.renshi.domain.ScientificResearchAchievementsStandard;
import cn.nfsysu.renshi.domain.ScientificResearchAchievementsStandardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScientificResearchAchievementsStandardMapper {
    long countByExample(ScientificResearchAchievementsStandardExample example);

    int deleteByExample(ScientificResearchAchievementsStandardExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ScientificResearchAchievementsStandard record);

    int insertSelective(ScientificResearchAchievementsStandard record);

    List<ScientificResearchAchievementsStandard> selectByExample(ScientificResearchAchievementsStandardExample example);

    ScientificResearchAchievementsStandard selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ScientificResearchAchievementsStandard record, @Param("example") ScientificResearchAchievementsStandardExample example);

    int updateByExample(@Param("record") ScientificResearchAchievementsStandard record, @Param("example") ScientificResearchAchievementsStandardExample example);

    int updateByPrimaryKeySelective(ScientificResearchAchievementsStandard record);

    int updateByPrimaryKey(ScientificResearchAchievementsStandard record);
}