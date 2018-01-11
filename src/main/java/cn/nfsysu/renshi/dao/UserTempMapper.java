package cn.nfsysu.renshi.dao;

import cn.nfsysu.renshi.domain.UserTemp;
import cn.nfsysu.renshi.domain.UserTempExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserTempMapper {

    UserTemp getPasswByName(String name);

    long countByExample(UserTempExample example);

    int deleteByExample(UserTempExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserTemp record);

    int insertSelective(UserTemp record);

    List<UserTemp> selectByExample(UserTempExample example);

    UserTemp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserTemp record, @Param("example") UserTempExample example);

    int updateByExample(@Param("record") UserTemp record, @Param("example") UserTempExample example);

    int updateByPrimaryKeySelective(UserTemp record);

    int updateByPrimaryKey(UserTemp record);
}