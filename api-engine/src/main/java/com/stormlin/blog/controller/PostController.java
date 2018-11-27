package com.stormlin.blog.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.stormlin.blog.common.Response;
import com.stormlin.blog.common.StatusCode;
import com.stormlin.blog.model.PostHtml;
import com.stormlin.blog.model.PostMarkdown;
import com.stormlin.blog.model.PostProfile;
import com.stormlin.blog.service.PostService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class PostController {

    private Logger logger = Logger.getLogger(PostController.class);

    @Resource
    private PostService postService;

    /**
     * 根据查询 ID 的不同返回指定 ID 的 Profile，或者全部文章的 Profile。
     * 当 ID 是某一数字的时候，则返回某一指定文章；若 ID = ALL，则返回所有文章的 Profile。
     *
     * @param id 文章 ID。合法输入值有正整数的 ID 值，或者 ALL。
     * @return 以 Response 封装的文章 Profile。
     */
    @ResponseBody
    @RequestMapping("/api/profile/{id}")
    public Response getPostProfile(@PathVariable String id) {

        logger.info("收到了查询具有以下 ID 的文章 Profile 的请求：" + id);
        Response response = new Response();
        ObjectMapper mapper = new ObjectMapper();

        // 统一转为小写后进行校验
        String requestedId = id.toLowerCase();

        if (requestedId.equals("all")) {
            /* 以 All 为请求，返回所有文章的 Profile */
            List<PostProfile> profileList = postService.getAllPostProfile();
//            response.setCode(StatusCode.NotFound);
            try {
                response.setBody(mapper.writeValueAsString(profileList));
            } catch (Exception e) {
                logger.error(e.toString());
                response.setBody(StatusCode.InternalServerError);
            }
            logger.info(response.getBody());
            return response;
        }

        /* 根据指定的 ID 返回文章 Profile */
        long postId = Long.parseLong(requestedId);
        PostProfile profile = postService.getPostProfileById(postId);

        if (profile == null) {
            // 该 ID 指定的文章不存在
            logger.info("ID 为 " + postId + " 的文章 Profile 不存在");
//            response.setCode(StatusCode.NotFound);
            response.setBody("");
            return response;
        } else {
//            response.setCode(StatusCode.OK);
            try {
                response.setBody(mapper.writeValueAsString(profile));
            } catch (Exception e) {
                logger.error(e.toString());
            }
            return response;
        }

    }

    /**
     * 根据查询的 ID 值来返回指定文章的 HTML 代码，供前端显示使用
     *
     * @param id 指定文章的 ID
     * @return 该文章的 HTML 代码
     */
    @ResponseBody
    @RequestMapping("/post/{id}")
    public Response getPostHtml(@PathVariable String id) {

        logger.info("收到了查询具有以下 ID 的文章 HTML 的请求：" + id);
        Response response = new Response();

        PostHtml postHtml = postService.getPostHtml(Long.parseLong(id));

        if (postHtml != null) {
            // 找到了指定文章的 HTML 代码
//            response.setCode(StatusCode.OK);
            try {
                response.setBody(postHtml.getHtml());
            } catch (Exception e) {
                logger.error(e.toString());
            }
            return response;
        } else {
            // 没找到指定文章的 HTML 代码
//            response.setCode(StatusCode.NotFound);
            response.setBody("");
            return response;
        }

    }

    /**
     * 根据查询的 ID 值来返回指定文章的 Markdown 代码，供编辑器使用
     *
     * @param id 指定文章的 ID
     * @return 该文章的 Markdown 代码
     */
    @ResponseBody
    @RequestMapping("/markdown/{id}")
    public Response getPostMarkdown(@PathVariable String id) {

        logger.info("收到了查询具有以下 ID 的文章 Markdown 的请求：" + id);
        Response response = new Response();

        PostMarkdown postMarkdown = postService.getPostMarkdown(Long.parseLong(id));

        if (postMarkdown != null) {
            // 找到了指定文章的 Markdown 代码
//            response.setCode(StatusCode.OK);
            try {
                response.setBody(postMarkdown.getMarkdown());
            } catch (Exception e) {
                logger.error(e.toString());
            }
            return response;
        } else {
            // 没找到指定文章的 HTML 代码
//            response.setCode(StatusCode.NotFound);
            response.setBody("");
            return response;
        }

    }

}
