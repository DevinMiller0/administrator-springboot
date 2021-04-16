package cn.gleaners.administrator.model;

import com.alibaba.fastjson.JSON;

/**
 * @author WangDeSheng
 * @date 2021-04-16 13:26
 * description：
 */
public class Category3Model {
    private String cid3;
    private String name;
    private String cid1;
    private String cid2;

    public String getCid3() {
        return cid3;
    }

    public void setCid3(String cid3) {
        this.cid3 = cid3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCid1() {
        return cid1;
    }

    public void setCid1(String cid1) {
        this.cid1 = cid1;
    }

    public String getCid2() {
        return cid2;
    }

    public void setCid2(String cid2) {
        this.cid2 = cid2;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
