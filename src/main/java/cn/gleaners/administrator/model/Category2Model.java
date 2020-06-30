package cn.gleaners.administrator.model;

import com.alibaba.fastjson.JSON;

/**
 * @author ：WangDeSheng
 * @date ：Created in 2019/12/23 21:35
 * @description：
 */
public class Category2Model {
    private String c2id;
    private String name;
    private String cid;

    public String getC2id() {
        return c2id;
    }

    public void setC2id(String c2id) {
        this.c2id = c2id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
