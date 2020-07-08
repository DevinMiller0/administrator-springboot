package cn.gleaners.administrator.mapper;

import cn.gleaners.administrator.model.ArticleModel;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author WangDeSheng
 * @date 2020/7/8 16:17
 * description：
 */
@Mapper
public interface IArticlePublishMapper {
    int saveArticle(ArticleModel articleModel);
}
