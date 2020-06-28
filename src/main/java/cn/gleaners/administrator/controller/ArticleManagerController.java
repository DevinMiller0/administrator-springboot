package cn.gleaners.administrator.controller;

import cn.gleaners.administrator.model.ArticleModel;
import cn.gleaners.administrator.service.ArticleManagerService;
import cn.gleaners.administrator.utils.response.Response;
import cn.gleaners.administrator.utils.response.ResultData;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author WangDeSheng
 * @date 2020/6/12 16:49
 * description：
 */
@Controller
public class ArticleManagerController {

    @Autowired
    ArticleManagerService articleManagerService;

    @GetMapping("/")
    @ResponseBody
    public String index() {
        return "hello world";
    }

    @PostMapping("/getArticle")
    @ResponseBody
    public ResultData<Object> getArticle(int pageNum) {
        PageHelper.startPage(pageNum, 10);
        PageInfo<ArticleModel> pageInfo = new PageInfo<>(articleManagerService.selectArticles());
        return Response.Success(pageInfo.getList());
    }

}
