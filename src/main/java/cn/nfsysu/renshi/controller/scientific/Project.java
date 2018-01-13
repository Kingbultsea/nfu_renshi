package cn.nfsysu.renshi.controller.scientific;

import cn.nfsysu.renshi.dao.ScientificResearchAchievementsProjectMapper;
import cn.nfsysu.renshi.domain.ScientificResearchAchievementsProject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by skyisbule on 2017/12/15.
 * 项目或者课题
 */

@RestController
@RequestMapping("/api/scientific")
public class Project {

    @Autowired
    ScientificResearchAchievementsProjectMapper proDao;

    @RequestMapping("/add-project-by-id")
    public String add(ScientificResearchAchievementsProject pro){
        return proDao.insert(pro)==1?"success":"error";
    }

    @RequestMapping("/get-project-by-id")
    public ScientificResearchAchievementsProject get(int id){
        return proDao.selectByPrimaryKey(id);
    }

    @RequestMapping("/update-project-by-id")
    public String update(ScientificResearchAchievementsProject pro){
        return  proDao.updateByPrimaryKey(pro)==1?"success":"error";
    }

}
