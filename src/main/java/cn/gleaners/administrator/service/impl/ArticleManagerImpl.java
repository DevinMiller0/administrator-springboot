package cn.gleaners.administrator.service.impl;

import cn.gleaners.administrator.mapper.IArticleManagerMapper;
import cn.gleaners.administrator.model.ArticleModel;
import cn.gleaners.administrator.model.Category2Model;
import cn.gleaners.administrator.model.CategoryModel;
import cn.gleaners.administrator.service.IArticleManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author WangDeSheng
 * @date 2020/6/28 17:53
 * description：
 */
@Service
public class ArticleManagerImpl implements IArticleManagerService {

    @Autowired
    IArticleManagerMapper articleManagerMapper;

    @Override
    public List<ArticleModel> selectArticles(String cid, String c2id) {
        return articleManagerMapper.selectArticles(cid, c2id);
    }

    @Override
    public int updateArticleState(int state, int id) {
        return articleManagerMapper.updateArticleState(state, id);
    }

    @Override
    public List<CategoryModel> selectCategory() {
        return articleManagerMapper.selectCategory();
    }

    @Override
    public List<Category2Model> selectC2ByCid(String cid) {
        return articleManagerMapper.selectC2ByCid(cid);
    }
}
