package cn.gleaners.adminstratorspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author WangDeSheng
 * @date 2020/6/12 16:53
 * description：
 */
@Controller
public class LoginController {

    @PostMapping("/login")
    @ResponseBody
    public String login(String username, String password) {

        return "login";
    }

}
