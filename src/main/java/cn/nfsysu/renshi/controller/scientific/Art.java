package cn.nfsysu.renshi.controller.scientific;

import cn.nfsysu.renshi.dao.ScientificResearchAchievementsArtMapper;
import cn.nfsysu.renshi.domain.ScientificResearchAchievementsArt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by skyisbule on 2017/12/15.
 * 艺术方面的科研成果
 */
@RestController
@RequestMapping("/scientific/api")
public class Art {

    @Autowired
    ScientificResearchAchievementsArtMapper artDao;

    @RequestMapping("/add-art-by-id")
    public String add(ScientificResearchAchievementsArt art){
        return artDao.insert(art)==1?"success":"error";
    }

    @RequestMapping("/get-art-by-id")
    public ScientificResearchAchievementsArt get(int id){
        return artDao.selectByPrimaryKey(id);
    }

    @RequestMapping("/update-art-by-id")
    public String update(ScientificResearchAchievementsArt art){
        return artDao.updateByPrimaryKey(art)==1?"success":"error";
    }

}
