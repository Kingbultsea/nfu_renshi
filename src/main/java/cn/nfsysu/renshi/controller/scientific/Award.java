package cn.nfsysu.renshi.controller.scientific;

import cn.nfsysu.renshi.dao.ScientificResearchAchievementsAwardMapper;
import cn.nfsysu.renshi.domain.ScientificResearchAchievementsAward;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by skyisbule on 2017/12/15.
 * 科研成果的奖励部分
 */
@RestController
@RequestMapping("/api/scientific")
public class Award {

    @Autowired
    ScientificResearchAchievementsAwardMapper awardDao;

    @RequestMapping("/add-award-by-id")
    public String add(ScientificResearchAchievementsAward award){
        return awardDao.insert(award)==1?"success":"error";
    }

    @RequestMapping("/get-award-by-id")
    public ScientificResearchAchievementsAward get(int id){
        return awardDao.selectByPrimaryKey(id);
    }

    @RequestMapping("/update-award-by-id")
    public String update(ScientificResearchAchievementsAward award){
        return awardDao.updateByPrimaryKey(award)==1?"success":"error";
    }

}
