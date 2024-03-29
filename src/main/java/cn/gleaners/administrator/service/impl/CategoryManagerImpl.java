package cn.gleaners.administrator.service.impl;

import cn.gleaners.administrator.mapper.ICategoryManagerMapper;
import cn.gleaners.administrator.model.Category2Model;
import cn.gleaners.administrator.model.Category3Model;
import cn.gleaners.administrator.model.CategoryModel;
import cn.gleaners.administrator.service.ICategoryManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public int modifyCategory2Info(Category2Model category2Model) {
        return mapper.modifyCategory2Info(category2Model);
    }

    @Override
    public int addCategory3(Category3Model category3Model) {
        return mapper.addCategory3(category3Model);
    }

    @Override
    public List<Category3Model> getCategory3(String cid1, String cid2) {
        return mapper.getCategory3(cid1, cid2);
    }

    @Override
    public int delCategory3(String cid3) {
        return mapper.delCategory3(cid3);
    }


}
