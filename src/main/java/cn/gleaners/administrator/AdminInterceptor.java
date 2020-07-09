package cn.gleaners.administrator;

import cn.gleaners.administrator.model.AdminEntity;
import cn.gleaners.administrator.utils.JwtUtils;
import cn.gleaners.administrator.utils.response.Code;
import cn.gleaners.administrator.utils.response.Message;
import cn.gleaners.administrator.utils.response.Response;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * @author ：WangDeSheng
 * @date ：Created in 2020/7/5 16:39
 * @description：
 */
public class AdminInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String token = request.getHeader("Authorization");
        AdminEntity adminEntity = JwtUtils.parseToken(token);
        if (adminEntity != null) {
            System.out.println(adminEntity.toString());
            return true;
        }else {
            response.setContentType("application/json; charset=utf-8");
            PrintWriter writer = response.getWriter();
            writer.print(Response.Failed(Code.UNAUTHORIZED, Message.UNAUTHORIZED, ""));
            writer.close();
            response.flushBuffer();
            return false;
        }
    }
}
