package cn.gleaners.administrator.controller;

import cn.gleaners.administrator.model.Category2Model;
import cn.gleaners.administrator.model.CategoryModel;
import cn.gleaners.administrator.service.ICategoryManagerService;
import cn.gleaners.administrator.service.impl.CategoryManagerImpl;
import cn.gleaners.administrator.utils.response.Code;
import cn.gleaners.administrator.utils.response.Message;
import cn.gleaners.administrator.utils.response.Response;
import cn.gleaners.administrator.utils.response.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author WangDeSheng
 * @date 2020/7/16 15:49
 * description：
 */
@Controller
@RequestMapping("/categoryManager")
public class CategoryManagerController {

    @Autowired
    ICategoryManagerService service;

    @PostMapping("/addCategory1")
    @ResponseBody
    public ResultData<Object> insertCategory1(@RequestBody CategoryModel categoryModel) {
        if (categoryModel == null) return Response.failed(Code.PARAM_ERROR, Message.PARAM_ERROR, "");

        int code = service.insertCategory1(categoryModel);
        if (code == 1) {
            return Response.success();
        }
        return Response.failed();
    }

    @PostMapping("/addCategory2")
    @ResponseBody
    public ResultData<Object> insertCategory2(@RequestBody Category2Model category2Model) {
        if (category2Model == null) return Response.failed(Code.PARAM_ERROR, Message.PARAM_ERROR, "");
        int code = service.insertCategory2(category2Model);
        if (code == 1) {
            return Response.success();
        }
        return Response.failed();
    }

    @PostMapping("/deleteCategory")
    @ResponseBody
    public ResultData<Object> deleteCategoryByCid(String cid) {
        if (StringUtils.isEmpty(cid)) return Response.failed(Code.PARAM_ERROR, Message.PARAM_ERROR, "");
        int code = service.deleteCategoryByCid(cid);
        if (code == 1) {
            return Response.success();
        }
        return Response.failed();
    }

    @PostMapping("/deleteCategory2")
    @ResponseBody
    public ResultData<Object> deleteCategoryByC2id(String c2id) {
        if (StringUtils.isEmpty(c2id)) return Response.failed(Code.PARAM_ERROR, Message.PARAM_ERROR, "");

        int code = service.deleteCategoryByC2id(c2id);
        if (code == 1) {
            return Response.success();
        }
        return Response.failed();
    }

    @PostMapping("/modifyCategory2Info")
    @ResponseBody
    public ResultData<Object> modifyCategory2Info(@RequestBody Category2Model category2Model) {
        if (category2Model != null) {
            int code = service.modifyCategory2Info(category2Model);
            if (code == 1) {
                return Response.success();
            } else {
                return Response.failed();
            }
        } else {
            return Response.failed(Code.PARAM_ERROR, Message.PARAM_ERROR, "");
        }
    }

}
