package cn.gleaners.administrator.controller;

import cn.gleaners.administrator.model.ArticleModel;
import cn.gleaners.administrator.service.IArticlePublishService;
import cn.gleaners.administrator.service.impl.ArticlePublishImpl;
import cn.gleaners.administrator.utils.response.Response;
import cn.gleaners.administrator.utils.response.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public ResultData<Object> Publish(@RequestBody ArticleModel articleModel) {
        if (articleModel != null) {
            System.out.println(articleModel.toString());
            int code = articlePublishService.saveArticle(articleModel);
            if (code == 1) {
                return Response.Success();
            }else {
                return Response.Failed();
            }
        }else {
            return Response.Failed();
        }
    }

}
