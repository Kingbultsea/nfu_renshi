package cn.nfsysu.renshi.controller.common;

import cn.nfsysu.renshi.dao.TeacherQualificationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by skyisbule on 2017/12/15.
 * 教师资格信息
 */
@RestController
@RequestMapping("/api/common")
public class TeacherQualification {

    @Autowired
    TeacherQualificationMapper teacherDao;

    @RequestMapping("/add-teaQual-by-id")
    public String add(cn.nfsysu.renshi.domain.TeacherQualification tea){
        return teacherDao.insert(tea)==1?"success":"error";
    }

    @RequestMapping("/get-teaQual-by-id")
    public cn.nfsysu.renshi.domain.TeacherQualification get(int id){
        return teacherDao.selectByPrimaryKey(id);
    }

    @RequestMapping("/update-teaQual-by-id")
    public String update(cn.nfsysu.renshi.domain.TeacherQualification tea){
        return teacherDao.updateByPrimaryKey(tea)==1?"success":"error";
    }


}
