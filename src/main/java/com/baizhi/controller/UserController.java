package com.baizhi.controller;

import com.baizhi.dao.UserDao;
import com.baizhi.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    UserDao userDao;

    @RequestMapping("selectAll")
    public String selectAll(Map map) {
        List<User> list = userDao.selectAll();
        map.put("list", list);
        return "b";
    }

}
