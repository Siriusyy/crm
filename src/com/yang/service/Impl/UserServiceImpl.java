package com.yang.service.Impl;

import com.yang.dao.UserDao;
import com.yang.domain.User;
import com.yang.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
    @Resource(name = "userDao")
    private UserDao userDao;

    @Override
    public User login(User user) {
        return userDao.login(user);
    }
}
