package com.javaweb.back.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSON;
import com.javaweb.bean.User;
import com.javaweb.cache.CacheKey;
import com.javaweb.cache.CacheService;
import com.javaweb.service.UserService;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

@Autowired
private UserService userService;

@Autowired
private CacheService cacheService;

@RequestMapping(value="/home", method=RequestMethod.GET)
@PreAuthorize("isAuthenticated()")
public String showHomePage() {
    try {
        
        User user = userService.loadUserByUsername("admin");

        cacheService.set(CacheKey.LOGIN_USER_KEY + user.getId(), JSON.toJSONString(user));

        String userStr = cacheService.get(CacheKey.LOGIN_USER_KEY + user.getId());

        User u = JSON.parseObject(userStr, User.class);
        if(u != null){
        	LOGGER.info("user:{}", u);
        }
        LOGGER.info("load user ");
    }catch (Exception e){
    	LOGGER.error(e.getLocalizedMessage(), e);
    }

    return "/index/index";
}


}
