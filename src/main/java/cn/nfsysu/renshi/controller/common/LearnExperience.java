package cn.nfsysu.renshi.controller.common;

import cn.nfsysu.renshi.dao.LearningExperienceMapper;
import cn.nfsysu.renshi.domain.LearningExperience;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by skyisbule on 2017/12/15.
 * 学习经历
 */
@RestController
@RequestMapping("/api/common")
public class LearnExperience {

    @Autowired
    LearningExperienceMapper LearnDao;

    @RequestMapping("/add-learning-by-id")
    public String add(LearningExperience Learn){
        return LearnDao.insert(Learn)==1?"success":"error";
    }

    @RequestMapping("/get-learning-by-id")
    public LearningExperience get(int id){
        return LearnDao.selectByPrimaryKey(id);
    }

    @RequestMapping("/update-learning-by-id")
    public String update(LearningExperience Learn){
        return LearnDao.updateByPrimaryKey(Learn)==1?"success":"error";
    }

}
