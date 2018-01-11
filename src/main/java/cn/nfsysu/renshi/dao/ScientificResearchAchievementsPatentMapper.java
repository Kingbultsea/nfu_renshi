package cn.nfsysu.renshi.dao;

import cn.nfsysu.renshi.domain.ScientificResearchAchievementsPatent;
import cn.nfsysu.renshi.domain.ScientificResearchAchievementsPatentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScientificResearchAchievementsPatentMapper {
    long countByExample(ScientificResearchAchievementsPatentExample example);

    int deleteByExample(ScientificResearchAchievementsPatentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ScientificResearchAchievementsPatent record);

    int insertSelective(ScientificResearchAchievementsPatent record);

    List<ScientificResearchAchievementsPatent> selectByExample(ScientificResearchAchievementsPatentExample example);

    ScientificResearchAchievementsPatent selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ScientificResearchAchievementsPatent record, @Param("example") ScientificResearchAchievementsPatentExample example);

    int updateByExample(@Param("record") ScientificResearchAchievementsPatent record, @Param("example") ScientificResearchAchievementsPatentExample example);

    int updateByPrimaryKeySelective(ScientificResearchAchievementsPatent record);

    int updateByPrimaryKey(ScientificResearchAchievementsPatent record);
}