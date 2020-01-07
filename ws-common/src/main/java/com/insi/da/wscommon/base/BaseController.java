package com.insi.da.wscommon.base;

import com.insi.da.wscommon.pojo.result.LoginUser;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: hd
 * @description: 请求基础封装类
 * @author: XuChao
 * @create: 2019-12-30 17:58
 **/
public class BaseController {

    //获取登录
    public LoginUser getRequest() {
        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
        HttpServletRequest req =((ServletRequestAttributes) ra).getRequest();
        String token = req.getHeader("token");

        //TODO
        return null;
    }


}
