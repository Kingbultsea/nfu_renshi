package cn.nfsysu.renshi.controller.common;

import cn.nfsysu.renshi.dao.InfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by skyisbule on 2017/12/15.
 * 用户基础信息
 * @Author skyisbule
 */
@RestController
@RequestMapping("/api/common")
public class Info {

    @Autowired
    InfoMapper infoMapper;

    @RequestMapping("/get-info-by-id")
    public Object test(int id){
        return infoMapper.selectByPrimaryKey(id);
    }

    @RequestMapping("/add-info-by-all")
    public String add(cn.nfsysu.renshi.domain.Info info){
        if (infoMapper.insertSelective(info)==1){
            return "success";
        }
        return "error";
    }

    @RequestMapping("/update-by-id")
    public String update(cn.nfsysu.renshi.domain.Info info){
        if (infoMapper.updateByPrimaryKey(info)==1)
            return "success";
        return "error";
    }

}
