package com.yang.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.yang.domain.User;
import com.yang.service.UserService;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller("userAction")
@Scope("prototype")
@ParentPackage(value = "struts-default")
@Namespace("/")
public class UserAction extends ActionSupport implements ModelDriven<User> {

    @Resource(name = "userService")
    private UserService userService;
    User user=new User();
    @Override
    public User getModel() {
        return user;
    }

    @Action(value = "user_login")
    public String login(){
        System.out.println(user.toString());
        System.out.println("login............");
        return NONE;
    }

}
