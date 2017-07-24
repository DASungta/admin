package com.dasungta.admin.Controller;

import com.dasungta.admin.Domain.User.User;
import com.dasungta.admin.Domain.User.UserRepository;
import com.dasungta.admin.Utils.ResultMsg;
import com.dasungta.admin.Utils.ResultStatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static com.dasungta.admin.Utils.Encode.user_md5;
import static com.dasungta.admin.Utils.Md5Util.md5;

/**
 * Created with IntelliJ IDEA.
 * User: zyc77
 * Date: 2017/7/24
 * Time: 17:37
 */

@RestController
@RequestMapping(value = "/login")
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping(value = "login")
    public Object login(@RequestParam("username") String username, @RequestParam("password") String password) throws Exception {
        User user = new User();
        user = userRepository.findUserByUsername(username);
        ResultMsg resultMsg = new ResultMsg(ResultStatusCode.OK.getErrcode(), ResultStatusCode.OK.getErrmsg(), user);
        return user_md5(password);
//        return resultMsg;

    }

}
