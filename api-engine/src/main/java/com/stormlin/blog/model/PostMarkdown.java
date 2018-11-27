package com.stormlin.blog.model;

public class PostMarkdown {

    // 文章 ID
    private long id;
    // 文章的原始 Markdown 代码
    private String markdown;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getMarkdown() {
        return markdown;
    }
    public void setMarkdown(String markdown) {
        this.markdown = markdown;
    }

}
