package cn.nfsysu.renshi.controller.common;

import cn.nfsysu.renshi.dao.TalentProjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by skyisbule on 2017/12/15.
 * 人才入选项目
 */
@RestController
@RequestMapping("/api/common")
public class TalentProject {

    @Autowired
    TalentProjectMapper tanDao;

    @RequestMapping("/add-talent-by-id")
    public String add(cn.nfsysu.renshi.domain.TalentProject tal){
        return tanDao.insert(tal)==1?"success":"error";
    }

    @RequestMapping("/get-talent-by-id")
    public cn.nfsysu.renshi.domain.TalentProject get(int id){
        return tanDao.selectByPrimaryKey(id);
    }

    @RequestMapping("/update-talnt-by-id")
    public String update(cn.nfsysu.renshi.domain.TalentProject tal){
        return tanDao.updateByPrimaryKey(tal)==1?"success":"error";
    }


}
