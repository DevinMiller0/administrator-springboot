package cn.gleaners.administrator.controller;

import cn.gleaners.administrator.model.UserModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @author WangDeSheng
 * @date 2020/6/12 16:53
 * description：
 */
@Controller
public class LoginController {

    @PostMapping("/login")
    @ResponseBody
    public String login(@RequestBody Map<String, Object> userMap) {
        System.out.println(userMap.toString());
        return "Success in login...";
    }

}
