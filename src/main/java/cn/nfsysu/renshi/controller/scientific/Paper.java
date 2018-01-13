package cn.nfsysu.renshi.controller.scientific;

import cn.nfsysu.renshi.dao.ScientificResearchAchievementsPaperMapper;
import cn.nfsysu.renshi.domain.ScientificResearchAchievementsPaper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by skyisbule on 2017/12/15.
 * 论文部分
 */
@RestController
@RequestMapping("/api/scientific")
public class Paper {

    @Autowired
    ScientificResearchAchievementsPaperMapper paperDao;

    @RequestMapping("/add-paper-by-id")
    public String add(ScientificResearchAchievementsPaper paper){
        return paperDao.insert(paper)==1?"success":"error";
    }

    @RequestMapping("/get-paper-by-id")
    public ScientificResearchAchievementsPaper get(int id){
        return paperDao.selectByPrimaryKey(id);
    }

    @RequestMapping("/update-paper-by-id")
    public String update(ScientificResearchAchievementsPaper paper){
        return paperDao.updateByPrimaryKey(paper)==1?"success":"error";
    }

}
