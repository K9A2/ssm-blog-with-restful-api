package com.stormlin.blog.model;

/**
 * 文章渲染好的 HTML 代码，可以直接显示在页面当中
 */
public class PostHtml {

    // 文章 ID
    private long id;
    // 渲染好的文章的 HTML 代码
    private String html;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getHtml() {
        return html;
    }
    public void setHtml(String html) {
        this.html = html;
    }

}
