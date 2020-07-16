package cn.gleaners.administrator.service.impl;

import cn.gleaners.administrator.mapper.ICategoryManagerMapper;
import cn.gleaners.administrator.model.Category2Model;
import cn.gleaners.administrator.model.CategoryModel;
import cn.gleaners.administrator.service.ICategoryManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author WangDeSheng
 * @date 2020/7/16 15:51
 * description：
 */
@Service
public class CategoryManagerImpl implements ICategoryManagerService {
    @Autowired
    ICategoryManagerMapper mapper;

    @Override
    public int insertCategory1(CategoryModel categoryModel) {
        return mapper.insertCategory1(categoryModel);
    }

    @Override
    public int insertCategory2(Category2Model category2Model) {
        return mapper.insertCategory2(category2Model);
    }

    @Override
    public int deleteCategoryByCid(String cid) {
        return mapper.deleteCategoryByCid(cid);
    }

    @Override
    public int deleteCategoryByC2id(String c2id) {
        return mapper.deleteCategoryByC2id(c2id);
    }
}
