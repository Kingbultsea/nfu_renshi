package cn.nfsysu.renshi.controller.skills;

import cn.nfsysu.renshi.dao.LanguageSkillMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by skyisbule on 2017/12/15.
 * 语言能力
 */

@RestController
@RequestMapping("/api/skills")
public class LanguageSkill {

    @Autowired
    LanguageSkillMapper lanDao;

    @RequestMapping("add-language-by-id")
    public String add(cn.nfsysu.renshi.domain.LanguageSkill lan){
        return lanDao.insert(lan)==1?"success":"error";
    }

    @RequestMapping("/get-language-by-id")
    public cn.nfsysu.renshi.domain.LanguageSkill get(int id){
        return lanDao.selectByPrimaryKey(id);
    }

    @RequestMapping("/update-language-by-id")
    public String updage(cn.nfsysu.renshi.domain.LanguageSkill lan){
        return lanDao.updateByPrimaryKey(lan)==1?"success":"error";
    }

}
