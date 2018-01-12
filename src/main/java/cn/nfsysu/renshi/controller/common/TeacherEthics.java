package cn.nfsysu.renshi.controller.common;

import cn.nfsysu.renshi.dao.TeacherEthicsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by skyisbule on 2017/12/15.
 * 师德信息
 */
@RestController
@RequestMapping("/api/common")
public class TeacherEthics {

    @Autowired
    TeacherEthicsMapper teacherDao;

    @RequestMapping("/add-teacherEthics-by-id")
    public String add(cn.nfsysu.renshi.domain.TeacherEthics tea){
        return teacherDao.insert(tea)==1?"success":"error";
    }

    @RequestMapping("/get-teacherEthics-by-id")
    public cn.nfsysu.renshi.domain.TeacherEthics get(int id){
        return teacherDao.selectByPrimaryKey(id);
    }

    @RequestMapping("/update-teacherEthics-by-id")
    public String update(cn.nfsysu.renshi.domain.TeacherEthics tea){
        return teacherDao.updateByPrimaryKey(tea)==1?"success":"error";
    }


}
