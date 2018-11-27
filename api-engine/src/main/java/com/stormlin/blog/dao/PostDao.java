package com.stormlin.blog.dao;

import com.stormlin.blog.model.PostHtml;
import com.stormlin.blog.model.PostMarkdown;
import com.stormlin.blog.model.PostProfile;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostDao {

    /**
     * 获取所有文章的 Profile，主要作用是为了首页显示所有文章的内容提供数据
     *
     * @return 包含所有文章的 Profile 的列表
     */
    List<PostProfile> getAllPostProfile();

    /**
     * 根据文章 ID 获取指定文章的 Profile
     *
     * @param postId 文章的 ID
     * @return 文章的 Profile
     */
    PostProfile getPostProfileById(long postId);

    /**
     * 根据文章 ID 获取此文章渲染好的的 HTML 代码，可直接显示在页面当中
     *
     * @param postId 文章的 ID
     * @return 文章的 HTML 代码
     */
    PostHtml getPostHtml(long postId);

    /**
     * 根据文章 ID 获取此文章的原始 Markdown 代码
     *
     * @param postId 文章的 ID
     * @return 文章的 Markdown 代码
     */
    PostMarkdown getPostMarkdown(long postId);

}
