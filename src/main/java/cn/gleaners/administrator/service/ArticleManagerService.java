package cn.gleaners.administrator.service;

import cn.gleaners.administrator.model.ArticleModel;

import java.util.List;

/**
 * @author WangDeSheng
 * @date 2020/6/28 17:53
 * description：
 */
public interface ArticleManagerService {
    List<ArticleModel> selectArticles();
}
