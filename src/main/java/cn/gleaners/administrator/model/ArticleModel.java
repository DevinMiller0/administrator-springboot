package cn.gleaners.administrator.model;

import com.alibaba.fastjson.JSON;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author WangDeSheng
 * @date 2019/12/6 11:05
 * description：
 */
public class ArticleModel {
    private String id;
    private String title;
    private String article;
    private String author;
    private int author_id;
    private int views;
    private String category;
    private String category2;
    private String cid;
    private String c2id;
    private String c3id;
    private String time;
    private String description;
    private String updateTime;
    private String state;
    private String keywords;

    public String getC3id() {
        return c3id;
    }

    public void setC3id(String c3id) {
        this.c3id = c3id;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getC2id() {
        return c2id;
    }

    public void setC2id(String c2id) {
        this.c2id = c2id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(int author_id) {
        this.author_id = author_id;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory2() {
        return category2;
    }

    public void setCategory2(String category2) {
        this.category2 = category2;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
