package com.dasungta.admin.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

import static com.dasungta.admin.Utils.Encode.user_md5;

/**
 * Created with IntelliJ IDEA.
 * User: zyc77
 * Date: 2017/7/24
 * Time: 16:25
 */

@RestController
@RequestMapping(value = "index")
public class IndexController {


    @RequestMapping(value = "testCode")
    public String testCode(HttpServletRequest request) throws Exception {
        String username = "15850755224";
        String password = "123456";
        String sessionId = "le103opvcre2fj9vi385cqvaj2";
        return request.getSession().getId();
//        return user_md5(username+password+sessionId+"");
    }
}
