package cn.gleaners.administrator.mapper;

import cn.gleaners.administrator.model.Category2Model;
import cn.gleaners.administrator.model.CategoryModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author WangDeSheng
 * @date 2020/7/16 15:50
 * description：
 */
@Mapper
public interface ICategoryManagerMapper {
    int insertCategory1(CategoryModel categoryModel);
    int insertCategory2(Category2Model category2Model);
    int deleteCategoryByCid(String cid);
    int deleteCategoryByC2id(String c2id);
}
