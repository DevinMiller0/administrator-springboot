package cn.gleaners.administrator.controller;

import cn.gleaners.administrator.model.ArticleModel;
import cn.gleaners.administrator.model.Category2Model;
import cn.gleaners.administrator.model.CategoryModel;
import cn.gleaners.administrator.service.IArticleManagerService;
import cn.gleaners.administrator.utils.response.Code;
import cn.gleaners.administrator.utils.response.Message;
import cn.gleaners.administrator.utils.response.Response;
import cn.gleaners.administrator.utils.response.ResultData;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author WangDeSheng
 * @date 2020/6/12 16:49
 * description：
 */
@Controller
public class ArticleManagerController {

    @Autowired
    IArticleManagerService articleManagerService;

    @PostMapping("/getArticle")
    @ResponseBody
    public ResultData<Object> getArticle(int pageNum, String cid, String c2id) {
        PageHelper.startPage(pageNum, 8);
        PageHelper.orderBy("id desc");
        PageInfo<ArticleModel> pageInfo = new PageInfo<>(articleManagerService.selectArticles(cid, c2id));
        return Response.success(pageInfo);
    }

    @PostMapping("/getArticleById")
    @ResponseBody
    public ResultData<Object> getArticleById(String articleId) {
        ArticleModel articleModel = articleManagerService.selectArticleById(articleId);
        if (articleModel != null) {
            return Response.success(articleModel);
        }
        return Response.failed();
    }

    @PostMapping("/updateArticle")
    @ResponseBody
    public ResultData<Object> updateArticle(@RequestBody ArticleModel articleModel) {
        System.out.println(articleModel);
        int code = articleManagerService.updateArticle(articleModel);
        if (code == 1) {
            return Response.success();
        }
        return Response.failed();
    }

    @PostMapping("/setState")
    @ResponseBody
    public ResultData<Object> setState(int state, int id) {
        if (state != 0 && state != 1) {
            return Response.failed(Code.PARAM_ERROR, Message.PARAM_ERROR, "");
        }
        int c = articleManagerService.updateArticleState(state, id);
        if (c == 1) {
            return Response.success();
        } else {
            return Response.failed();
        }
    }

    @GetMapping("/getCategory")
    @ResponseBody
    public ResultData<Object> getCategory() {
        List<CategoryModel> list = articleManagerService.selectCategory();
        if (list != null) {
            return Response.success(list);
        } else {
            return Response.failed();
        }
    }

    @PostMapping("/getCategory2")
    @ResponseBody
    public ResultData<Object> getCategory2ByCid(@RequestParam("cid") String cid) {
        List<Category2Model> list = articleManagerService.selectC2ByCid(cid);
        if (list != null) {
            return Response.success(list);
        } else {
            return Response.failed();
        }
    }

    @PostMapping("/deleteArticle")
    @ResponseBody
    public ResultData<Object> deleteArticleById(String articleId) {
        System.out.println(articleId);
        int code = articleManagerService.deleteArticleById(articleId);
        if (code == 1) {
            return Response.success();
        }
        return Response.failed();
    }

    @PostMapping("/modifyArticleInfo")
    @ResponseBody
    public ResultData<Object> modifyArticleInfo(@RequestBody ArticleModel articleModel) {
        if (articleModel == null) {
            return Response.failed(Code.PARAM_ERROR, Message.PARAM_ERROR, "");
        }

        System.out.println(articleModel.toString());

        int code = articleManagerService.modifyArticleInfo(articleModel);
        if (code == 1) {
            return Response.success();
        }else {
            return Response.failed();
        }
    }
}
