package cn.nfsysu.renshi.controller.scientific;

import cn.nfsysu.renshi.dao.ScientificResearchAchievementsPatentMapper;
import cn.nfsysu.renshi.domain.ScientificResearchAchievementsPatent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by skyisbule on 2017/12/15.
 * 专利部分
 */

@RestController
@RequestMapping("/api/sicentific")
public class Patent {

    @Autowired
    ScientificResearchAchievementsPatentMapper patentDao;

    @RequestMapping("/add-patent-by-id")
    public String add(ScientificResearchAchievementsPatent patent){
        return patentDao.insert(patent)==1?"success":"error";
    }

    @RequestMapping("/get-patent-by-id")
    public ScientificResearchAchievementsPatent get(int id){
        return patentDao.selectByPrimaryKey(id);
    }

    @RequestMapping("/update-patent-by-id")
    public String update(ScientificResearchAchievementsPatent patent){
        return patentDao.updateByPrimaryKey(patent)==1?"success":"error";
    }


}
