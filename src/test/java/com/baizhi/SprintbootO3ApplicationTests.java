package com.baizhi;

import com.baizhi.dao.UserDao;
import com.baizhi.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)    //开启spring工厂
@SpringBootTest      //组合注解 开启spring的自动配置 自动装配dao service controller
public class SprintbootO3ApplicationTests {
    @Autowired
    UserDao dao;

    @Test
    public void delete() {
        User user = new User();
        user.setPassword("1111");
        int i = dao.deleteByPrimaryKey(user);//根据主键删除
        System.out.println(i);
    }

    @Test
    public void insert1() {
        User user = new User();
        user.setPassword("2222");
        int i = dao.insert(user);//添加，没赋值的为null
        System.out.println(i);
    }

    @Test
    public void insertSelective() {
        User user = new User();
        user.setPassword("2222");
        int i = dao.insertSelective(user);//添加，没赋值的为null
        System.out.println(i);
    }

    @Test
    public void update() {
        User user = new User();
        user.setPassword("333");
        user.setUserId(6);
        int i = dao.updateByPrimaryKeySelective(user);//删除根据主键,没赋值的为原有
        //int i = dao.updateByPrimaryKey(user);//删除根据主键,没赋值的为null
        System.out.println(i);
    }

    @Test
    public void select() {
        List<User> users = dao.selectAll();//查询全部
        for (User user : users) {
            System.out.println(user);
        }

    }

    @Test
    public void test() {

    }

}
