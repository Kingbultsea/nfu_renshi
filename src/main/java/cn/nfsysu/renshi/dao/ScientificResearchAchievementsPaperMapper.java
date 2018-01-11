package cn.nfsysu.renshi.dao;

import cn.nfsysu.renshi.domain.ScientificResearchAchievementsPaper;
import cn.nfsysu.renshi.domain.ScientificResearchAchievementsPaperExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScientificResearchAchievementsPaperMapper {
    long countByExample(ScientificResearchAchievementsPaperExample example);

    int deleteByExample(ScientificResearchAchievementsPaperExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ScientificResearchAchievementsPaper record);

    int insertSelective(ScientificResearchAchievementsPaper record);

    List<ScientificResearchAchievementsPaper> selectByExample(ScientificResearchAchievementsPaperExample example);

    ScientificResearchAchievementsPaper selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ScientificResearchAchievementsPaper record, @Param("example") ScientificResearchAchievementsPaperExample example);

    int updateByExample(@Param("record") ScientificResearchAchievementsPaper record, @Param("example") ScientificResearchAchievementsPaperExample example);

    int updateByPrimaryKeySelective(ScientificResearchAchievementsPaper record);

    int updateByPrimaryKey(ScientificResearchAchievementsPaper record);
}