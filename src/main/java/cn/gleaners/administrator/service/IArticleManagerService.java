package cn.gleaners.administrator.service;

import cn.gleaners.administrator.model.ArticleModel;
import cn.gleaners.administrator.model.Category2Model;
import cn.gleaners.administrator.model.CategoryModel;

import java.util.List;

/**
 * @author WangDeSheng
 * @date 2020/6/28 17:53
 * description：
 */
public interface IArticleManagerService {
    List<ArticleModel> selectArticles(String cid, String c2id);

    int updateArticleState(int state, int id);

    List<CategoryModel> selectCategory();

    List<Category2Model> selectC2ByCid(String cid);

    ArticleModel selectArticleById(String articleId);

    int updateArticle(ArticleModel articleModel);

    int deleteArticleById(String articleId);

    int modifyArticleInfo(ArticleModel articleModel);

    int modifyKeywords(ArticleModel articleModel);
}
