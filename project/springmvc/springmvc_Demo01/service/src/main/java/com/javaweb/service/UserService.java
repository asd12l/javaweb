package com.javaweb.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javaweb.bean.User;
import com.javaweb.dao.mapper.UserMapper;

@Service
public class UserService {
private static final Logger logger = LoggerFactory.getLogger(UserService.class);

@Autowired
private UserMapper userMapper;

@Transactional
public User loadUserByUsername(String username) {
	return userMapper.loadUserByUsername(username);
}
@Transactional
public void saveUser(User user) {
	userMapper.saveUser( user);
}



}
