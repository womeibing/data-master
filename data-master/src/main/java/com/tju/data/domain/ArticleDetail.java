package com.tju.data.domain;

import java.util.Date;
import java.util.List;

public class ArticleDetail {
    private String id;
    private String title;
    private Date pub_date;
    private String content;

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Date getPub_date() {
        return pub_date;
    }

    public String getContent() {
        return content;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPub_date(Date pub_date) {
        this.pub_date = pub_date;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "ArticleDetail{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", pub_date=" + pub_date +
                ", content='" + content + '\'' +
                '}';
    }
}
