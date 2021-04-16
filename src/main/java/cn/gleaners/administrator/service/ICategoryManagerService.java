package cn.gleaners.administrator.service;

import cn.gleaners.administrator.model.Category2Model;
import cn.gleaners.administrator.model.Category3Model;
import cn.gleaners.administrator.model.CategoryModel;

import java.util.List;

/**
 * @author WangDeSheng
 * @date 2020/7/16 15:51
 * description：
 */
public interface ICategoryManagerService {
    int insertCategory1(CategoryModel categoryModel);

    int insertCategory2(Category2Model category2Model);

    int deleteCategoryByCid(String cid);

    int deleteCategoryByC2id(String c2id);

    int modifyCategory2Info(Category2Model category2Model);

    int addCategory3(Category3Model category3Model);

    List<Category3Model> getCategory3(String cid1, String cid2);

    int delCategory3(String cid3);
}
