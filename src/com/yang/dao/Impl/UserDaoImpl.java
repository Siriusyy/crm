package com.yang.dao.Impl;

import com.yang.dao.UserDao;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Resource(name = "hibernateTemplate")
    private HibernateTemplate hibernateTemplate;
    @Override
    public void login() {

    }
}
