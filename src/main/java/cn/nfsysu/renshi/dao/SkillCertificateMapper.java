package cn.nfsysu.renshi.dao;

import cn.nfsysu.renshi.domain.SkillCertificate;
import cn.nfsysu.renshi.domain.SkillCertificateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkillCertificateMapper {
    long countByExample(SkillCertificateExample example);

    int deleteByExample(SkillCertificateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SkillCertificate record);

    int insertSelective(SkillCertificate record);

    List<SkillCertificate> selectByExample(SkillCertificateExample example);

    SkillCertificate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SkillCertificate record, @Param("example") SkillCertificateExample example);

    int updateByExample(@Param("record") SkillCertificate record, @Param("example") SkillCertificateExample example);

    int updateByPrimaryKeySelective(SkillCertificate record);

    int updateByPrimaryKey(SkillCertificate record);
}