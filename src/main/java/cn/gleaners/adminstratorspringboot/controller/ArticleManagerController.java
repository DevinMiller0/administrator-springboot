package cn.gleaners.adminstratorspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author WangDeSheng
 * @date 2020/6/12 16:49
 * description：
 */
@Controller
public class ArticleManagerController {

    @GetMapping("/")
    @ResponseBody
    public String index() {
        return "hello world";
    }

}
