package cn.gleaners.administrator.model;

import com.alibaba.fastjson.JSON;

/**
 * @author ：WangDeSheng
 * @date ：Created in 2019/12/9 23:55
 * @description：
 */
public class CategoryModel {
    private String cid;
    private String categoryName;

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
