package cn.nfsysu.renshi.controller.scientific;

import cn.nfsysu.renshi.dao.ScientificResearchAchievementsMedicineMapper;
import cn.nfsysu.renshi.domain.ScientificResearchAchievementsMedicine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.PublicKey;

/**
 * Created by skyisbule on 2017/12/15.
 * 国家医药证书
 */
@RestController
@RequestMapping("/api/scientific")
public class Medicine {

    @Autowired
    ScientificResearchAchievementsMedicineMapper medDao;

    @RequestMapping("/get-medicine-by-id")
    public ScientificResearchAchievementsMedicine get(int id){
        return medDao.selectByPrimaryKey(id);
    }

    @RequestMapping("/add-medicine-by-id")
    public String add(ScientificResearchAchievementsMedicine med){
        return medDao.insert(med)==1?"success":"error";
    }

    @RequestMapping("/update-medicine-by-id")
    public String update(ScientificResearchAchievementsMedicine med){
        return medDao.updateByPrimaryKey(med)==1?"success":"error";
    }

}
