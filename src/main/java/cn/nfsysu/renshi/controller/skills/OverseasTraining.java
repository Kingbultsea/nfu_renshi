package cn.nfsysu.renshi.controller.skills;

import cn.nfsysu.renshi.dao.OverseasTrainingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by skyisbule on 2017/12/15.
 * 海外培训
 */

@RestController
@RequestMapping("/api/skills")
public class OverseasTraining {

    @Autowired
    OverseasTrainingMapper trainingDao;

    @RequestMapping("/add-overtraining-by-id")
    public String add(cn.nfsysu.renshi.domain.OverseasTraining training){
        return trainingDao.insert(training)==1?"success":"error";
    }

    @RequestMapping("/get-overtraining-by-id")
    public cn.nfsysu.renshi.domain.OverseasTraining get(int id){
        return trainingDao.selectByPrimaryKey(id);
    }

    @RequestMapping("/update-overtraining-by-id")
    public String update(cn.nfsysu.renshi.domain.OverseasTraining training){
        return trainingDao.updateByPrimaryKey(training)==1?"success":"error";
    }

}
