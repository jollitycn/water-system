package com.insi.da.wscommon.pojo.result;

import lombok.Data;

/**
 * @program: gift
 * @description: 系统登录用户
 * @author: XuChao
 * @create: 2019-12-24 16:50
 **/
@Data
public class LoginUser {

    //用户id
    private Long uid;

    //用户名称
    private String userName;
}
