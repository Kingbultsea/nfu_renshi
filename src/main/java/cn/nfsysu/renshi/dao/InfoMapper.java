package cn.nfsysu.renshi.dao;

import cn.nfsysu.renshi.domain.Info;
import cn.nfsysu.renshi.domain.InfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InfoMapper {

    //计算行数
    long countByExample(InfoExample example);

    //删除
    int deleteByExample(InfoExample example);

    int deleteByPrimaryKey(Integer id);

    //添加整行
    int insert(Info record);

    //主键自增添加
    int insertSelective(Info record);

    //查询
    List<Info> selectByExample(InfoExample example);

    //单个查询
    Info selectByPrimaryKey(Integer id);


    int updateByExampleSelective(@Param("record") Info record, @Param("example") InfoExample example);

    int updateByExample(@Param("record") Info record, @Param("example") InfoExample example);

    int updateByPrimaryKeySelective(Info record);

    int updateByPrimaryKey(Info record);
}