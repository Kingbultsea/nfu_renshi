package cn.nfsysu.renshi.dao;

import cn.nfsysu.renshi.domain.TalentProject;
import cn.nfsysu.renshi.domain.TalentProjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TalentProjectMapper {
    long countByExample(TalentProjectExample example);

    int deleteByExample(TalentProjectExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TalentProject record);

    int insertSelective(TalentProject record);

    List<TalentProject> selectByExample(TalentProjectExample example);

    TalentProject selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TalentProject record, @Param("example") TalentProjectExample example);

    int updateByExample(@Param("record") TalentProject record, @Param("example") TalentProjectExample example);

    int updateByPrimaryKeySelective(TalentProject record);

    int updateByPrimaryKey(TalentProject record);
}