package cn.gleaners.administrator.service;

import cn.gleaners.administrator.model.ArticleModel;

/**
 * @author WangDeSheng
 * @date 2020/7/8 16:18
 * description：
 */
public interface IArticlePublishService {
    int saveArticle(ArticleModel articleModel);
}
