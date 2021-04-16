package cn.gleaners.administrator.mapper;

import cn.gleaners.administrator.model.Category2Model;
import cn.gleaners.administrator.model.Category3Model;
import cn.gleaners.administrator.model.CategoryModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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

    int modifyCategory2Info(Category2Model category2Model);

    int addCategory3(Category3Model category3Model);

    List<Category3Model> getCategory3(@Param("cid1") String cid1, @Param("cid2") String cid2);

    int delCategory3(String cid3);

}
