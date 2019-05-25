package com.yang.dao.Impl;

import com.yang.dao.UserDao;
import com.yang.domain.User;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Resource(name = "hibernateTemplate")
    private HibernateTemplate hibernateTemplate;

    @Override
    public User login(User user) {

        List <User> list = (List <User>) hibernateTemplate.find("from User where user_code = ?0 and user_password = ?1", user.getUser_code(), user.getUser_password());
        if (list.size()>0){
            return list.get(0);
        }
        return null;
    }
}
