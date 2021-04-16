package cn.gleaners.administrator.controller;

import cn.gleaners.administrator.model.Category2Model;
import cn.gleaners.administrator.model.Category3Model;
import cn.gleaners.administrator.model.CategoryModel;
import cn.gleaners.administrator.service.ICategoryManagerService;
import cn.gleaners.administrator.service.impl.CategoryManagerImpl;
import cn.gleaners.administrator.utils.response.*;
import com.sun.media.jfxmedia.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public ResultData<?> insertCategory1(@RequestBody CategoryModel categoryModel) {
        if (categoryModel == null) return Response.failed(Result.PARAM_ERROR, "");

        int code = service.insertCategory1(categoryModel);
        if (code == 1) {
            return Response.success();
        }
        return Response.failed();
    }

    @PostMapping("/addCategory2")
    @ResponseBody
    public ResultData<?> insertCategory2(@RequestBody Category2Model category2Model) {
        if (category2Model == null) return Response.failed(Result.PARAM_ERROR, "");
        int code = service.insertCategory2(category2Model);
        if (code == 1) {
            return Response.success();
        }
        return Response.failed();
    }

    @PostMapping("/deleteCategory")
    @ResponseBody
    public ResultData<?> deleteCategoryByCid(String cid) {
        if (StringUtils.isEmpty(cid)) return Response.failed(Result.PARAM_ERROR, "");
        int code = service.deleteCategoryByCid(cid);
        if (code == 1) {
            return Response.success();
        }
        return Response.failed();
    }

    @PostMapping("/deleteCategory2")
    @ResponseBody
    public ResultData<?> deleteCategoryByC2id(String c2id) {
        if (StringUtils.isEmpty(c2id)) return Response.failed(Result.PARAM_ERROR, "");

        int code = service.deleteCategoryByC2id(c2id);
        if (code == 1) {
            return Response.success();
        }
        return Response.failed();
    }

    @PostMapping("/modifyCategory2Info")
    @ResponseBody
    public ResultData<?> modifyCategory2Info(@RequestBody Category2Model category2Model) {
        if (category2Model != null) {
            int code = service.modifyCategory2Info(category2Model);
            if (code == 1) {
                return Response.success();
            } else {
                return Response.failed();
            }
        } else {
            return Response.failed(Result.PARAM_ERROR, "");
        }
    }

    @PostMapping("/addCategory3")
    @ResponseBody
    public ResultData<?> addCategory3(@RequestBody Category3Model category3Model) {
        if (category3Model != null) {
            System.out.println(category3Model.toString());
            int code = service.addCategory3(category3Model);
            if (code == 1) {
                return Response.success();
            } else {
                return Response.failed();
            }
        } else {
            return Response.failed(Result.PARAM_ERROR, "");
        }
    }

    @PostMapping("/getCategory3")
    @ResponseBody
    public ResultData<?> getCategory3(String cid1, String cid2) {
        if (!StringUtils.isEmpty(cid1) && !StringUtils.isEmpty(cid2)) {
            List<Category3Model> list = service.getCategory3(cid1, cid2);
            if (list != null) {
                return Response.success(list);
            } else {
                return Response.failed();
            }
        } else {
            return Response.failed(Result.PARAM_ERROR, "");
        }
    }

    @PostMapping("/delCategory3")
    @ResponseBody
    public ResultData<?> delCategory3(String cid3) {
        if (!StringUtils.isEmpty(cid3)) {
            int code = service.delCategory3(cid3);
            if (code == 1) {
                return Response.success();
            } else {
                return Response.failed();
            }
        } else {
            return Response.failed(Result.PARAM_ERROR, "");
        }
    }

}
