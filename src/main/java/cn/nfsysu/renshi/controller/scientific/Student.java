package cn.nfsysu.renshi.controller.scientific;

import cn.nfsysu.renshi.dao.ScientificResearchAchievementsStudentMapper;
import cn.nfsysu.renshi.domain.ScientificResearchAchievementsStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by skyisbule on 2017/12/15.
 * 指导学生获奖
 */

@RestController
@RequestMapping("/api/scientific")
public class Student {

    @Autowired
    ScientificResearchAchievementsStudentMapper stuDao;

    @RequestMapping("/add-student-by-id")
    public String add(ScientificResearchAchievementsStudent stu){
        return stuDao.insert(stu)==1?"success":"error";
    }

    @RequestMapping("/get-student-by-id")
    public ScientificResearchAchievementsStudent get(int id){
        return stuDao.selectByPrimaryKey(id);
    }

    @RequestMapping("/update-student-by-id")
    public String update(ScientificResearchAchievementsStudent stu){
        return stuDao.updateByPrimaryKey(stu)==1?"success":"error";
    }

}
