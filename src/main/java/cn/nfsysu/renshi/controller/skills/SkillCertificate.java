package cn.nfsysu.renshi.controller.skills;

import cn.nfsysu.renshi.dao.SkillCertificateMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by skyisbule on 2017/12/15.
 * 技能证书
 */

@RestController
@RequestMapping("/api/skills")
public class SkillCertificate {

    @Autowired
    SkillCertificateMapper skillDao;

    @RequestMapping("/add-certificate-by-id")
    public String add(cn.nfsysu.renshi.domain.SkillCertificate skill){
        return skillDao.insert(skill)==1?"success":"error";
    }

    @RequestMapping("/get-certificate-by-id")
    public cn.nfsysu.renshi.domain.SkillCertificate get(int id){
        return skillDao.selectByPrimaryKey(id);
    }

    @RequestMapping("/update-certificate-by-id")
    public String update(cn.nfsysu.renshi.domain.SkillCertificate skill){
        return skillDao.updateByPrimaryKey(skill)==1?"success":"error";
    }

}
