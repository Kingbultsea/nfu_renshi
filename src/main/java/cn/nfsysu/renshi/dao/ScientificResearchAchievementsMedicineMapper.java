package cn.nfsysu.renshi.dao;

import cn.nfsysu.renshi.domain.ScientificResearchAchievementsMedicine;
import cn.nfsysu.renshi.domain.ScientificResearchAchievementsMedicineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScientificResearchAchievementsMedicineMapper {
    long countByExample(ScientificResearchAchievementsMedicineExample example);

    int deleteByExample(ScientificResearchAchievementsMedicineExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ScientificResearchAchievementsMedicine record);

    int insertSelective(ScientificResearchAchievementsMedicine record);

    List<ScientificResearchAchievementsMedicine> selectByExample(ScientificResearchAchievementsMedicineExample example);

    ScientificResearchAchievementsMedicine selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ScientificResearchAchievementsMedicine record, @Param("example") ScientificResearchAchievementsMedicineExample example);

    int updateByExample(@Param("record") ScientificResearchAchievementsMedicine record, @Param("example") ScientificResearchAchievementsMedicineExample example);

    int updateByPrimaryKeySelective(ScientificResearchAchievementsMedicine record);

    int updateByPrimaryKey(ScientificResearchAchievementsMedicine record);
}