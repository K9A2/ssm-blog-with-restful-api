package com.stormlin.blog.service.impl;

import com.stormlin.blog.dao.PostDao;
import com.stormlin.blog.model.PostHtml;
import com.stormlin.blog.model.PostMarkdown;
import com.stormlin.blog.model.PostProfile;
import com.stormlin.blog.service.PostService;
import org.apache.commons.lang.StringEscapeUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class PostServiceImpl implements PostService {

    @Resource
    private PostDao postDao;

    /**
     * 获取所有文章的 Profile，主要作用是为了首页显示所有文章的内容提供数据
     *
     * @return 包含所有文章的 Profile 的列表
     */
    public List<PostProfile> getAllPostProfile() {
        return postDao.getAllPostProfile();
    }

    /**
     * 根据文章 ID 获取指定文章的 Profile
     *
     * @param postId 文章的 ID
     * @return 文章的 Profile
     */
    public PostProfile getPostProfileById(long postId) {
        return postDao.getPostProfileById(postId);
    }

    /**
     * 根据文章 ID 获取此文章渲染好的的 HTML 代码，可直接显示在页面当中
     *
     * @param postId 文章的 ID
     * @return 文章的 HTML 代码
     */
    public PostHtml getPostHtml(long postId) {
        // 去除转义字符
        PostHtml postHtml = postDao.getPostHtml(postId);
        String html = StringEscapeUtils.unescapeHtml(postHtml.getHtml()).
                replaceAll("(\r\n|\r|\n|\n\r)", "");
        postHtml.setHtml(html);
        return postHtml;
    }

    /**
     * 根据文章 ID 获取此文章的原始 Markdown 代码
     *
     * @param postId 文章的 ID
     * @return 文章的 Markdown 代码
     */
    public PostMarkdown getPostMarkdown(long postId) {
        PostMarkdown postMarkdown = postDao.getPostMarkdown(postId);
        String markdown = StringEscapeUtils.unescapeHtml(postMarkdown.getMarkdown());
        postMarkdown.setMarkdown(markdown);
        return postMarkdown;
    }

}
