package com.stormlin.blog.model;

/**
 * 首页文章摘要的实体类
 */
public class PostProfile {

    private long id;
    private String title;
    private String description;
    private String tag;
    private String createTime;
    private String modifyTime;
    private boolean isTop;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getTag() {
        return tag;
    }
    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getCreateTime() {
        return createTime;
    }
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getModifyTime() {
        return modifyTime;
    }
    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }

    public boolean isTop() {
        return isTop;
    }
    public void setTop(boolean top) {
        this.isTop = top;
    }

}
