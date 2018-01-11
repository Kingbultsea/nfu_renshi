package cn.nfsysu.renshi.dao;

import cn.nfsysu.renshi.domain.ScientificResearchAchievementsArt;
import cn.nfsysu.renshi.domain.ScientificResearchAchievementsArtExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScientificResearchAchievementsArtMapper {
    long countByExample(ScientificResearchAchievementsArtExample example);

    int deleteByExample(ScientificResearchAchievementsArtExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ScientificResearchAchievementsArt record);

    int insertSelective(ScientificResearchAchievementsArt record);

    List<ScientificResearchAchievementsArt> selectByExample(ScientificResearchAchievementsArtExample example);

    ScientificResearchAchievementsArt selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ScientificResearchAchievementsArt record, @Param("example") ScientificResearchAchievementsArtExample example);

    int updateByExample(@Param("record") ScientificResearchAchievementsArt record, @Param("example") ScientificResearchAchievementsArtExample example);

    int updateByPrimaryKeySelective(ScientificResearchAchievementsArt record);

    int updateByPrimaryKey(ScientificResearchAchievementsArt record);
}