package cn.edu.scau.linyuanbin.recruitment.service.impl;

import cn.edu.scau.linyuanbin.recruitment.domain.User;
import cn.edu.scau.linyuanbin.recruitment.mapper.UserMapper;
import cn.edu.scau.linyuanbin.recruitment.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: linyuanbin
 * @Description:
 * @Date: Created in 19:23 2020/3/25
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper mapper;

    @Override
    public int insertUser(User user) {
        return mapper.insertUser(user);
    }

    @Override
    public void updateUser(User user) {
        mapper.updateUser(user);
    }

    @Override
    public User getUserByuserId(Integer userId) {
        return mapper.getUserByuserId(userId);
    }

    @Override
    public User getUserByemail(String email) {
        return mapper.getUserByemail(email);
    }
}
