package cn.gleaners.administrator.mapper;

import cn.gleaners.administrator.model.ArticleModel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author WangDeSheng
 * @date 2020/6/28 17:52
 * description：
 */
@Mapper
public interface ArticleManagerMapper {
    List<ArticleModel> selectArticles();
}
