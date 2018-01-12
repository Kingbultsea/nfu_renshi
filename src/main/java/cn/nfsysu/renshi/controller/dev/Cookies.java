package cn.nfsysu.renshi.controller.dev;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by skyisbule on 2018/1/12.
 * 测试用的，给前端开获取cookie的接口。
 */
@RestController
public class Cookies {


    @RequestMapping("/dev/getcookie")
    public Map getCookie(HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        if (cookies==null)
            return new HashMap();

        Map<String,String> map = new HashMap<String, String>();
        for (Cookie cookie :cookies){
            map.put(cookie.getName(),cookie.getValue());
        }

        return map;
    }

}
