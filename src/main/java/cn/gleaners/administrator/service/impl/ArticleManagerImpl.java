package cn.gleaners.administrator.service.impl;

import cn.gleaners.administrator.mapper.ArticleManagerMapper;
import cn.gleaners.administrator.model.ArticleModel;
import cn.gleaners.administrator.service.ArticleManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author WangDeSheng
 * @date 2020/6/28 17:53
 * description：
 */
@Service
public class ArticleManagerImpl implements ArticleManagerService {

    @Autowired
    ArticleManagerMapper articleManagerMapper;

    @Override
    public List<ArticleModel> selectArticles() {
        return articleManagerMapper.selectArticles();
    }
}
