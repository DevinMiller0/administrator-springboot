package cn.gleaners.administrator.controller;

import cn.gleaners.administrator.model.ArticleModel;
import cn.gleaners.administrator.service.IArticlePublishService;
import cn.gleaners.administrator.utils.response.Response;
import cn.gleaners.administrator.utils.response.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author WangDeSheng
 * @date 2020/7/6 15:19
 * description：
 */
@Controller
@RequestMapping("/publish")
public class ArticlePublishController {

    @Autowired
    IArticlePublishService articlePublishService;

    @PostMapping("/saveArticle")
    @ResponseBody
    public ResultData<Object> Publish(@RequestBody ArticleModel articleModel, HttpServletRequest httpRequest) {
        System.out.println(httpRequest.getQueryString());
        if (articleModel != null) {
            System.out.println("dddd-> " + articleModel.toString());
            int code = articlePublishService.saveArticle(articleModel);
            System.out.println(code);
            if (code == 1) {
                return Response.success();
            } else {
                return Response.failed();
            }
        } else {
            return Response.failed();
        }
    }
}
