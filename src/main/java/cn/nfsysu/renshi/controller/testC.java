package cn.nfsysu.renshi.controller;

import cn.nfsysu.renshi.domain.Info;
import cn.nfsysu.renshi.domain.InfoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import cn.nfsysu.renshi.dao.InfoMapper;

@RestController
public class testC {

    @Autowired
    InfoMapper infoMapper;

    @RequestMapping("/api/get-info-by-id")
    public Object test(int id){
        return infoMapper.selectByPrimaryKey(id);
    }

    @RequestMapping("/api/add-info-by-all")
    public String add(Info info){

        System.out.println(info.toString());

        if (infoMapper.insertSelective(info)==1){
            return "success";
        }
        return "error";
    }

    @RequestMapping("/api/update-by-id")
    public String update(Info info){
        if (infoMapper.updateByPrimaryKey(info)==1)
            return "success";
        return "error";
    }

    @RequestMapping("/api/delete-by-id")
    public String delete(int id){
        if (infoMapper.deleteByPrimaryKey(id)==1)
            return "success";
        return "error";
    }


    @RequestMapping("/api/test")
    public Object testing(int a ,int b){
        InfoExample example = new InfoExample();

        example.createCriteria()
                .andIdBetween(a,b);

        return infoMapper.selectByExample(example);
    }



}
