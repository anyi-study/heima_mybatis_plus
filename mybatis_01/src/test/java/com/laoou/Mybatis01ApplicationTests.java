package com.laoou;

import com.laoou.dao.UserDao;
import com.laoou.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Mybatis01ApplicationTests {

    @Autowired
    private UserDao userDao;



//    根据ID查询
    @Test
    void testGetById(){
        User user = userDao.selectById("1");
        System.out.println(user);
    }
//    更新
    @Test
    void testUpdate(){
        User user = new User();
        user.setId(1L);
        user.setName("老罗666");
        user.setPassword("123456");

        userDao.updateById(user);
    }


//    删除
    @Test
    void testDelete(){
        userDao.deleteById("1683827284185698305");
    }

//    新增
    @Test
    void testSave(){
        User user = new User();
        user.setName("老罗");
        user.setPassword("laoou");
        user.setAge(12);
        user.setTel("1231");
        userDao.insert(user);
    }
//    查询全部
    @Test
    void testGetAll() {
        List<User> users = userDao.selectList(null);
        System.out.println(users);
    }

}
