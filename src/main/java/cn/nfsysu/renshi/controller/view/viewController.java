package cn.nfsysu.renshi.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by skyisbule on 2018/1/13.
 * 此控制器用来返回视图  即html页面
 */

@Controller
public class viewController {


    @RequestMapping("/")
    public String index(){return "index";}

}
