package cn.nfsysu.renshi.dao;

import cn.nfsysu.renshi.domain.LanguageSkill;
import cn.nfsysu.renshi.domain.LanguageSkillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LanguageSkillMapper {
    long countByExample(LanguageSkillExample example);

    int deleteByExample(LanguageSkillExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LanguageSkill record);

    int insertSelective(LanguageSkill record);

    List<LanguageSkill> selectByExample(LanguageSkillExample example);

    LanguageSkill selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LanguageSkill record, @Param("example") LanguageSkillExample example);

    int updateByExample(@Param("record") LanguageSkill record, @Param("example") LanguageSkillExample example);

    int updateByPrimaryKeySelective(LanguageSkill record);

    int updateByPrimaryKey(LanguageSkill record);
}