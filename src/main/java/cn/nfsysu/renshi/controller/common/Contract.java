package cn.nfsysu.renshi.controller.common;

import cn.nfsysu.renshi.dao.ContactInformationMapper;
import cn.nfsysu.renshi.domain.ContactInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * Created by skyisbule on 2017/12/15.
 * 联系方式相关的接口
 */
@RestController
public class Contract {

    @Autowired
    ContactInformationMapper contactDao;

    @RequestMapping("/api/common/get-contact-by-id")
    public ContactInformation getAll(int id){
        return contactDao.selectByPrimaryKey(id);
    }

    @RequestMapping("/api/common/add-contact-by-id")
    public String add(ContactInformation con){
        return contactDao.insert(con)==1?"success":"error";
    }

    @RequestMapping("/api/common/update-contact-by-id")
    public String update(ContactInformation con){
        return contactDao.updateByPrimaryKey(con)==1?"success":"error";
    }

}
