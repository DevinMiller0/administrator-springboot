package cn.gleaners.administrator.service.impl;

import cn.gleaners.administrator.mapper.IArticlePublishMapper;
import cn.gleaners.administrator.model.ArticleModel;
import cn.gleaners.administrator.service.IArticlePublishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author WangDeSheng
 * @date 2020/7/8 16:19
 * description：
 */
@Service
public class ArticlePublishImpl implements IArticlePublishService {
    @Autowired
    IArticlePublishMapper articlePublishMapper;

    @Override
    public int saveArticle(ArticleModel articleModel) {
        return articlePublishMapper.saveArticle(articleModel);
    }
}
