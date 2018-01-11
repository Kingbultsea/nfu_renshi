package cn.nfsysu.renshi.dao;

import cn.nfsysu.renshi.domain.OtherSkill;
import cn.nfsysu.renshi.domain.OtherSkillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OtherSkillMapper {
    long countByExample(OtherSkillExample example);

    int deleteByExample(OtherSkillExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OtherSkill record);

    int insertSelective(OtherSkill record);

    List<OtherSkill> selectByExample(OtherSkillExample example);

    OtherSkill selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OtherSkill record, @Param("example") OtherSkillExample example);

    int updateByExample(@Param("record") OtherSkill record, @Param("example") OtherSkillExample example);

    int updateByPrimaryKeySelective(OtherSkill record);

    int updateByPrimaryKey(OtherSkill record);
}