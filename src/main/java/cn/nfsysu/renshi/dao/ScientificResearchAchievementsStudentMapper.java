package cn.nfsysu.renshi.dao;

import cn.nfsysu.renshi.domain.ScientificResearchAchievementsStudent;
import cn.nfsysu.renshi.domain.ScientificResearchAchievementsStudentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScientificResearchAchievementsStudentMapper {
    long countByExample(ScientificResearchAchievementsStudentExample example);

    int deleteByExample(ScientificResearchAchievementsStudentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ScientificResearchAchievementsStudent record);

    int insertSelective(ScientificResearchAchievementsStudent record);

    List<ScientificResearchAchievementsStudent> selectByExample(ScientificResearchAchievementsStudentExample example);

    ScientificResearchAchievementsStudent selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ScientificResearchAchievementsStudent record, @Param("example") ScientificResearchAchievementsStudentExample example);

    int updateByExample(@Param("record") ScientificResearchAchievementsStudent record, @Param("example") ScientificResearchAchievementsStudentExample example);

    int updateByPrimaryKeySelective(ScientificResearchAchievementsStudent record);

    int updateByPrimaryKey(ScientificResearchAchievementsStudent record);
}