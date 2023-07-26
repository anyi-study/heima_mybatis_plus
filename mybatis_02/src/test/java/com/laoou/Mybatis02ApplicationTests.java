package com.laoou;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.laoou.dao.UserDao;
import com.laoou.domain.User;
import com.laoou.domain.query.UserQuery;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Mybatis02ApplicationTests {
    @Autowired
    private UserDao userDao;

    @Test
    void testGetAll() {
//        方式一:
//        QueryWrapper qw = new QueryWrapper();
//        qw.lt("age",18);
//        List<User> users = userDao.selectList(qw);
//        System.out.println(users);
        //        方式二:
//        QueryWrapper<User> qw = new QueryWrapper<User>();
//        qw.lambda().lt(User::getAge,18);
//        List<User> users = userDao.selectList(qw);
//        System.out.println(users);
//        //        方式三:
//        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
//        lqw.lt(User::getAge,25);
//        List<User> users = userDao.selectList(lqw);
//        System.out.println(users);
        //        方式三:
//        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
//1
//        lqw.lt(User::getAge,10);
//        lqw.gt(User::getAge,1);
//2
//        1-10之间
//        lqw.gt(User::getAge,1).lt(User::getAge,10);
//3
//        小于1或者大于10
//        lqw.gt(User::getAge,1).or().lt(User::getAge,10);
//
//        List<User> users = userDao.selectList(lqw);
//        System.out.println(users);


////        空判定
//        UserQuery uq = new UserQuery();
////        uq.setAge(10);
//        uq.setAge2(1);
//
//        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
////        lqw.lt(User::getAge,uq.getAge());
////        下条与注释条区别:判断第一个条件是否是true，是则拼接后面
//        lqw.lt(null!=uq.getAge(),User::getAge,uq.getAge());
//        lqw.gt(null!=uq.getAge2(),User::getAge,uq.getAge2());
//        List<User> users = userDao.selectList(lqw);
//        System.out.println(users);

//        查询投影
    }

}
