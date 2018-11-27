package com.stormlin.blog.controller;

import com.stormlin.blog.common.Response;
import com.stormlin.blog.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class UserController {

    private Logger logger = Logger.getLogger(UserController.class);

    @Resource
    private UserService userService;

    @ResponseBody
    @RequestMapping("/showUser/{id}")
    public Response showUser(@PathVariable String id) {
        long userId = Long.parseLong(id);
        logger.info("用户访问 - 查询所有用户信息");
        Response response = new Response();
//        response.setCode("200");
        response.setBody("200");
        return response;
    }

}
