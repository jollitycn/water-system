package com.insi.hd.wsmanager.controller;


import com.insi.da.wscommon.util.RandImageValidateCodeUtils;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author XuChao
 * @since 2020-01-07
 */
 @Slf4j
 @Api(value = "AaaController", tags = {"测试接口"})
@RestController
@RequestMapping("/aaa")
public class AaaController {

    @PostMapping("/getValidateCodeImage")
    public void getValidateCodeImage(HttpServletRequest request, HttpServletResponse response) {
        try {
            //设置相应类型,告诉浏览器输出的内容为图片
            response.setContentType("image/jpeg");
            //设置响应头信息，告诉浏览器不要缓存此内容
            response.setHeader("Pragma", "No-cache");
            response.setHeader("Cache-Control", "no-cache");
            response.setDateHeader("Expire", 0);
            RandImageValidateCodeUtils randomValidateCode = new RandImageValidateCodeUtils();
            //输出验证码图片方法
            randomValidateCode.getRandCode(request, response);
        } catch (Exception e) {
            log.error("获取验证码失败>>>>   ", e);
        }
    }

}
