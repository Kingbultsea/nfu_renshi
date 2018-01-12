package cn.nfsysu.renshi.controller.common;

import cn.nfsysu.renshi.dao.ProfessionalDutiesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by skyisbule on 2017/12/15.
 * 专业职务任聘
 */
@RestController
@RequestMapping("/api/common")
public class ProfessionalDuties {

    @Autowired
    ProfessionalDutiesMapper proDao;

    @RequestMapping("/add-profession-by-id")
    public String add(cn.nfsysu.renshi.domain.ProfessionalDuties pro){
        return proDao.insert(pro)==1?"succss":"error";
    }

    @RequestMapping("/get-profession-by-id")
    public cn.nfsysu.renshi.domain.ProfessionalDuties get(int id){
        return proDao.selectByPrimaryKey(id);
    }

    @RequestMapping("/update-profession-by-id")
    public String update(cn.nfsysu.renshi.domain.ProfessionalDuties pro){
        return proDao.updateByPrimaryKey(pro)==1?"success":"error";
    }

}
