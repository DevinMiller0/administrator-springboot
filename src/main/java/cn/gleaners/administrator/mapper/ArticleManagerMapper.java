package cn.gleaners.administrator.mapper;

import cn.gleaners.administrator.model.ArticleModel;
import cn.gleaners.administrator.model.Category2Model;
import cn.gleaners.administrator.model.CategoryModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author WangDeSheng
 * @date 2020/6/28 17:52
 * description：
 */
@Mapper
public interface ArticleManagerMapper {
    List<ArticleModel> selectArticles(@Param("cid") String cid, @Param("c2id") String c2id);

    int updateArticleState(@Param("state") int state, @Param("id") int id);

    List<CategoryModel> selectCategory();

    List<Category2Model> selectC2ByCid(String cid);
}
