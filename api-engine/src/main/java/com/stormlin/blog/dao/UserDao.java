package com.stormlin.blog.dao;

import com.stormlin.blog.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    User selectUserById(@Param("userId") Long userId);

    User selectUserByPhoneOrEmail(@Param("emailOrPhone") String emailOrPhone, @Param("state") Short state);

    List<User> selectAllUser();

    User selectUserByName(@Param("userName") String userName);

    void addUser(User user);

    void deleteUserById(@Param("userId") Long userId);

    void updateUser(User user);

}

