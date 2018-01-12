package cn.nfsysu.renshi.controller.common;

import cn.nfsysu.renshi.dao.EducationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by skyisbule on 2017/12/15.
 * 教育教学类
 */

@RestController
@RequestMapping("/api/common")
public class Education {

    @Autowired
    EducationMapper eduDao;


    @RequestMapping("/add-education-by-id")
    public String add(cn.nfsysu.renshi.domain.Education edu){
        return eduDao.insert(edu)==1?"suucess":"error";
    }

    @RequestMapping("/get-education-by-id")
    public cn.nfsysu.renshi.domain.Education getEud(int id){
        return eduDao.selectByPrimaryKey(id);
    }

    @RequestMapping("/update-education-by-id")
    public String update(cn.nfsysu.renshi.domain.Education edu){
        return eduDao.updateByPrimaryKey(edu)==1?"success":"error";
    }
}
