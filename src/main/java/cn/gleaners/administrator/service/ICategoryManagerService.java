package cn.gleaners.administrator.service;

import cn.gleaners.administrator.model.Category2Model;
import cn.gleaners.administrator.model.CategoryModel;

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
}
