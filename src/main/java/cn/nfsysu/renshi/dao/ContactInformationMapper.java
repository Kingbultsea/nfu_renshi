package cn.nfsysu.renshi.dao;

import cn.nfsysu.renshi.domain.ContactInformation;
import cn.nfsysu.renshi.domain.ContactInformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContactInformationMapper {
    long countByExample(ContactInformationExample example);

    int deleteByExample(ContactInformationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ContactInformation record);

    int insertSelective(ContactInformation record);

    List<ContactInformation> selectByExample(ContactInformationExample example);

    ContactInformation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ContactInformation record, @Param("example") ContactInformationExample example);

    int updateByExample(@Param("record") ContactInformation record, @Param("example") ContactInformationExample example);

    int updateByPrimaryKeySelective(ContactInformation record);

    int updateByPrimaryKey(ContactInformation record);
}