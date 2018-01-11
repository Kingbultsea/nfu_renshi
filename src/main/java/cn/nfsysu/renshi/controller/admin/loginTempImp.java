package cn.nfsysu.renshi.controller.admin;

import cn.nfsysu.renshi.dao.UserTempMapper;
import cn.nfsysu.renshi.domain.UserTemp;
import cn.nfsysu.renshi.domain.UserTempExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by skyisbule on 2018/1/11.
 */
@RestController
public class loginTempImp implements login {
    @Autowired
    UserTempMapper userDao;



    @RequestMapping("/admin/login")
    public String login(String userName, String passwd, HttpServletResponse response){
        System.out.println(userName+" "+passwd);
        UserTemp user = userDao.getPasswByName(userName);

        if (user==null){
            return "error";
        }

        if (user.getPasswd().equals(passwd)){
            //设置两个cookie    id  密码
            Cookie idcookie = new Cookie("id",String.valueOf(user.getId()));
            //密码
            Cookie session = new Cookie("session",user.getPasswd());
            response.addCookie(idcookie);
            response.addCookie(session);
            return "success";
        }

        return "error";
    }
}
