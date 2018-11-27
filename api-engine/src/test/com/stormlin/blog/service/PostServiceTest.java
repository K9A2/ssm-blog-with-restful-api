package com.stormlin.blog.service;

import com.stormlin.blog.model.PostProfile;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mvc.xml")
public class PostServiceTest {

    private Logger logger = Logger.getLogger(PostService.class);

    @Resource
    private PostService postService;

    @Test
    public void testGetAllPostProfile() {

        List<PostProfile> postProfileList = postService.getAllPostProfile();
        logger.debug(postProfileList);

    }

}
