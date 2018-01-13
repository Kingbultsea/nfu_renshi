package cn.nfsysu.renshi.controller.skills;

import cn.nfsysu.renshi.dao.DomesticTrainingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by skyisbule on 2017/12/15.
 * 国内培训
 */

@RestController
@RequestMapping("/api/skills")
public class DomesticTraining {

    @Autowired
    DomesticTrainingMapper DtrainingDao;

    @RequestMapping("/add-Dtraining-by-id")
    public String add(cn.nfsysu.renshi.domain.DomesticTraining training){
        return DtrainingDao.insert(training)==1?"success":"error";
    }

    @RequestMapping("/get-Dtraining-by-id")
    public cn.nfsysu.renshi.domain.DomesticTraining get(int id){
        return DtrainingDao.selectByPrimaryKey(id);
    }

    @RequestMapping("/update-Dtraining-by-id")
    public String update(cn.nfsysu.renshi.domain.DomesticTraining training){
        return DtrainingDao.updateByPrimaryKey(training)==1?"success":"error";
    }

}
