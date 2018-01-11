package cn.nfsysu.renshi.dao;

import cn.nfsysu.renshi.domain.ProfessionalDuties;
import cn.nfsysu.renshi.domain.ProfessionalDutiesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProfessionalDutiesMapper {
    long countByExample(ProfessionalDutiesExample example);

    int deleteByExample(ProfessionalDutiesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProfessionalDuties record);

    int insertSelective(ProfessionalDuties record);

    List<ProfessionalDuties> selectByExample(ProfessionalDutiesExample example);

    ProfessionalDuties selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProfessionalDuties record, @Param("example") ProfessionalDutiesExample example);

    int updateByExample(@Param("record") ProfessionalDuties record, @Param("example") ProfessionalDutiesExample example);

    int updateByPrimaryKeySelective(ProfessionalDuties record);

    int updateByPrimaryKey(ProfessionalDuties record);
}