package com.laoou;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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


    //    分页
    @Test
    void testGetByPage() {
        IPage page = new Page(2, 2);

        userDao.selectPage(page, null);
        System.out.println("当前页码值" + page.getCurrent());
        System.out.println("每页显示数" + page.getSize());
        System.out.println("一共多少页" + page.getPages());
        System.out.println("一共多少条数据" + page.getTotal());
        System.out.println("数据" + page.getRecords());
    }

    //    根据ID查询
    @Test
    void testGetById() {
        User user = userDao.selectById("1");
        System.out.println(user);
    }

    //    更新
    @Test
    void testUpdate() {
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
        user.setName("老罗4");
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
