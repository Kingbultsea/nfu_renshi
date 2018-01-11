package cn.nfsysu.renshi.dao;

import cn.nfsysu.renshi.domain.DomesticTraining;
import cn.nfsysu.renshi.domain.DomesticTrainingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DomesticTrainingMapper {
    long countByExample(DomesticTrainingExample example);

    int deleteByExample(DomesticTrainingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DomesticTraining record);

    int insertSelective(DomesticTraining record);

    List<DomesticTraining> selectByExample(DomesticTrainingExample example);

    DomesticTraining selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DomesticTraining record, @Param("example") DomesticTrainingExample example);

    int updateByExample(@Param("record") DomesticTraining record, @Param("example") DomesticTrainingExample example);

    int updateByPrimaryKeySelective(DomesticTraining record);

    int updateByPrimaryKey(DomesticTraining record);
}