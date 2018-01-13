package cn.nfsysu.renshi.controller.scientific;

import cn.nfsysu.renshi.dao.ScientificResearchAchievementsStudyMapper;
import cn.nfsysu.renshi.domain.ScientificResearchAchievementsStudy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by skyisbule on 2017/12/15.
 * 咨询报告或研究报告
 */

@RestController
@RequestMapping("/api/scientific")
public class Study {

    @Autowired
    ScientificResearchAchievementsStudyMapper studyDao;

    @RequestMapping("/add-study-by-id")
    public String add(ScientificResearchAchievementsStudy study){
        return studyDao.insert(study)==1?"success":"error";
    }

    @RequestMapping("/get-study-by-id")
    public ScientificResearchAchievementsStudy get(int id){
        return studyDao.selectByPrimaryKey(id);
    }

    @RequestMapping("/update-study-by-id")
    public String update(ScientificResearchAchievementsStudy study){
        return studyDao.updateByPrimaryKey(study)==1?"success":"error";
    }

}
