package cn.nfsysu.renshi.dao;

import cn.nfsysu.renshi.domain.OverseasTraining;
import cn.nfsysu.renshi.domain.OverseasTrainingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OverseasTrainingMapper {
    long countByExample(OverseasTrainingExample example);

    int deleteByExample(OverseasTrainingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OverseasTraining record);

    int insertSelective(OverseasTraining record);

    List<OverseasTraining> selectByExample(OverseasTrainingExample example);

    OverseasTraining selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OverseasTraining record, @Param("example") OverseasTrainingExample example);

    int updateByExample(@Param("record") OverseasTraining record, @Param("example") OverseasTrainingExample example);

    int updateByPrimaryKeySelective(OverseasTraining record);

    int updateByPrimaryKey(OverseasTraining record);
}