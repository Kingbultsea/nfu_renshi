package cn.nfsysu.renshi.controller.skills;

import cn.nfsysu.renshi.dao.OtherSkillMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by skyisbule on 2017/12/15.
 * 其余能力
 */

@RestController
@RequestMapping("/api/skills")
public class OtherSkill {

    @Autowired
    OtherSkillMapper skillDao;

    @RequestMapping("/add-other-by-id")
    public String add(cn.nfsysu.renshi.domain.OtherSkill skill){
        return skillDao.insert(skill)==1?"success":"error";
    }

    @RequestMapping("/get-other-by-id")
    public cn.nfsysu.renshi.domain.OtherSkill get(int id){
        return skillDao.selectByPrimaryKey(id);
    }

    @RequestMapping("/update-other-by-id")
    public String update(cn.nfsysu.renshi.domain.OtherSkill skill){
        return skillDao.updateByPrimaryKey(skill)==1?"success":"error";
    }
}
