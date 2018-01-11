package cn.nfsysu.renshi.controller.admin;

import cn.nfsysu.renshi.domain.UserTemp;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by skyisbule on 2018/1/11.
 */
public interface login {

    public String login(String userName, String passwd, HttpServletResponse response);

}
