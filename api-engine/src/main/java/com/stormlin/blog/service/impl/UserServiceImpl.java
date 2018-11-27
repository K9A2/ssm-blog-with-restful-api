package com.stormlin.blog.service.impl;

import com.stormlin.blog.dao.UserDao;
import com.stormlin.blog.model.User;
import org.apache.ibatis.session.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

import com.stormlin.blog.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    public User getUserById(Long userId) {
        return userDao.selectUserById(userId);
    }

    public User getUserByPhoneOrEmail(String emailOrPhone, Short state) {
        return userDao.selectUserByPhoneOrEmail(emailOrPhone,state);
    }

    public List<User> getAllUser() {
        return userDao.selectAllUser();
    }

    public User GetUserByName(String name){
        return userDao.selectUserByName(name);
    }

    public boolean isUserExist(User user){
        return GetUserByName(user.getUserName())!=null;
    }

    public void saveUser(User user){
        userDao.addUser(user);
    }

    public void deleteUserById(Long userId){
        userDao.deleteUserById(userId);
    }

    public void updateUser(User user){
        userDao.updateUser(user);
    }
}
