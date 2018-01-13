package cn.nfsysu.renshi.controller.scientific;

import cn.nfsysu.renshi.dao.ScientificResearchAchievementsStandardMapper;
import cn.nfsysu.renshi.domain.ScientificResearchAchievementsStandard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by skyisbule on 2017/12/15.
 * 国家标准或行业标准
 */

@RestController
@RequestMapping("/api/scientific")
public class Standard {

    @Autowired
    ScientificResearchAchievementsStandardMapper standardDao;

    @RequestMapping("/add-standard-by-id")
    public String add(ScientificResearchAchievementsStandard standard){
        return standardDao.insert(standard)==1?"success":"error";
    }

    @RequestMapping("/get-standard-by-id")
    public ScientificResearchAchievementsStandard get(int id){
        return standardDao.selectByPrimaryKey(id);
    }

    @RequestMapping("/update-standard-by-id")
    public String update(ScientificResearchAchievementsStandard standard){
        return standardDao.updateByPrimaryKey(standard)==1?"success":"error";
    }

}
