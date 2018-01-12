package cn.nfsysu.renshi.controller.common;

import cn.nfsysu.renshi.dao.WorkExperienceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by skyisbule on 2017/12/15.
 * 工作经验
 */

@RestController
@RequestMapping("/api/common")
public class WorkExperience {

    @Autowired
    WorkExperienceMapper workDao;

    @RequestMapping("/add-work-by-id")
    public String add(cn.nfsysu.renshi.domain.WorkExperience work){
        return workDao.insert(work)==1?"success":"error";
    }

    @RequestMapping("/get-work-by-id")
    public cn.nfsysu.renshi.domain.WorkExperience get(int id){
        return workDao.selectByPrimaryKey(id);
    }

    @RequestMapping("/update-work-by-id")
    public String update(cn.nfsysu.renshi.domain.WorkExperience work){
        return workDao.updateByPrimaryKey(work)==1?"success":"error";
    }

}
