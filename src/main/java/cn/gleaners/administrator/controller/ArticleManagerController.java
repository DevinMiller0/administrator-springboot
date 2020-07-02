package cn.gleaners.administrator.controller;

import cn.gleaners.administrator.model.ArticleModel;
import cn.gleaners.administrator.model.Category2Model;
import cn.gleaners.administrator.model.CategoryModel;
import cn.gleaners.administrator.service.ArticleManagerService;
import cn.gleaners.administrator.utils.response.Code;
import cn.gleaners.administrator.utils.response.Message;
import cn.gleaners.administrator.utils.response.Response;
import cn.gleaners.administrator.utils.response.ResultData;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author WangDeSheng
 * @date 2020/6/12 16:49
 * description：
 */
@Controller
public class ArticleManagerController {

    @Autowired
    ArticleManagerService articleManagerService;

    @PostMapping("/getArticle")
    @ResponseBody
    public ResultData<Object> getArticle(@RequestParam("pageNum") int pageNum) {
        PageHelper.startPage(pageNum, 3);
        PageInfo<ArticleModel> pageInfo = new PageInfo<>(articleManagerService.selectArticles());
        return Response.Success(pageInfo);
    }

    @PostMapping("/setState")
    @ResponseBody
    public ResultData<Object> setState(@RequestParam("state") int state, @RequestParam("id") int id) {

        if (state != 0 && state != 1) {
            return Response.Failed(Code.PARAM_ERROR, Message.PARAM_ERROR, "");
        }

        int c = articleManagerService.updateArticleState(state, id);
        if (c == 1) {
            return Response.Success();
        } else {
            return Response.Failed();
        }

    }

    @GetMapping("/getCategory")
    @ResponseBody
    public ResultData<Object> getCategory() {
        List<CategoryModel> list = articleManagerService.selectCategory();
        if (list != null) {
            return Response.Success(list);
        } else {
            return Response.Failed();
        }
    }

    @PostMapping("/getCategory2")
    @ResponseBody
    public ResultData<Object> getCategory2ByCid(@RequestParam("cid") String cid) {
        List<Category2Model> list = articleManagerService.selectC2ByCid(cid);
        if (list != null) {
            return Response.Success(list);
        } else {
            return Response.Failed();
        }
    }
}
