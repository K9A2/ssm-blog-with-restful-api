package com.stormlin.blog.service;

import java.util.List;

import com.stormlin.blog.model.User;

public interface UserService {

    List<User> getAllUser();

    User getUserByPhoneOrEmail(String emailOrPhone, Short state);

    User getUserById(Long userId);

    boolean isUserExist(User user);

    void saveUser(User user);

    void deleteUserById(Long userId);

    void updateUser(User user);

}
