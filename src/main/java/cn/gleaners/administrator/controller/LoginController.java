package cn.gleaners.administrator.controller;

import cn.gleaners.administrator.model.AdminEntity;
import cn.gleaners.administrator.service.LoginService;
import cn.gleaners.administrator.utils.JwtUtils;
import cn.gleaners.administrator.utils.response.Code;
import cn.gleaners.administrator.utils.response.Message;
import cn.gleaners.administrator.utils.response.Response;
import cn.gleaners.administrator.utils.response.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @author WangDeSheng
 * @date 2020/6/12 16:53
 * description：
 */
@Controller
public class LoginController {

    @Autowired
    LoginService loginService;

    @PostMapping("/login")
    @ResponseBody
    public ResultData<Object> login(@RequestBody Map<String, Object> userMap) {

        String username = (String) userMap.get("username");
        String password = (String) userMap.get("password");

        if ("".equals(username) || "".equals(password)) {
            return Response.Failed(Code.PARAM_ERROR, Message.PARAM_ERROR, null);
        }

        AdminEntity admin = loginService.login(username, password);

        if (admin != null) {
            String token = JwtUtils.generateToken(admin);
            admin.setToken(token);
            return Response.Success(admin);
        }
        return Response.Failed();
    }
}
