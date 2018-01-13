package cn.nfsysu.renshi.controller.scientific;

import cn.nfsysu.renshi.dao.ScientificResearchAchievementsWritingsMapper;
import cn.nfsysu.renshi.domain.ScientificResearchAchievementsWritings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by skyisbule on 2017/12/15.
 * 著作类
 */

@RestController
@RequestMapping("/api/scientific")
public class Writings {

    @Autowired
    ScientificResearchAchievementsWritingsMapper writDao;

    @RequestMapping("/add-writing-by-id")
    public String add(ScientificResearchAchievementsWritings writings){
        return writDao.insert(writings)==1?"success":"error";
    }

    @RequestMapping("/get-writing-by-id")
    public ScientificResearchAchievementsWritings get(int id){
        return writDao.selectByPrimaryKey(id);
    }

    @RequestMapping("/update-writing-by-id")
    public String update(ScientificResearchAchievementsWritings writings){
        return writDao.updateByPrimaryKey(writings)==1?"success":"error";
    }

}
