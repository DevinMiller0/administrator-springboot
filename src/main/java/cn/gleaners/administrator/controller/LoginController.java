package cn.gleaners.administrator.controller;

import cn.gleaners.administrator.model.AdminEntity;
import cn.gleaners.administrator.service.ILoginService;
import cn.gleaners.administrator.utils.JwtUtils;
import cn.gleaners.administrator.utils.response.Code;
import cn.gleaners.administrator.utils.response.Message;
import cn.gleaners.administrator.utils.response.Response;
import cn.gleaners.administrator.utils.response.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author WangDeSheng
 * @date 2020/6/12 16:53
 * description：
 */
@Controller
public class LoginController {

    @Autowired
    ILoginService loginService;

    @PostMapping("/login")
    @ResponseBody
    public ResultData<Object> login(@RequestParam("username") String username, @RequestParam("password") String password) {
        if ("".equals(username) || "".equals(password)) {
            return Response.failed(Code.PARAM_ERROR, Message.PARAM_ERROR, null);
        }
        AdminEntity admin = loginService.login(username, password);
        if (admin != null) {
            String token = JwtUtils.generateToken(admin);
            admin.setToken(token);
            return Response.success(admin);
        }
        return Response.failed();
    }
}
