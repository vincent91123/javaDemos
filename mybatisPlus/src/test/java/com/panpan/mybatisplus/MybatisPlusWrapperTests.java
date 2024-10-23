package com.panpan.mybatisplus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.toolkit.Assert;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.panpan.mybatisplus.entity.User;
import com.panpan.mybatisplus.mapper.UserMapper;
import com.panpan.mybatisplus.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

@SpringBootTest
class MybatisPlusWrapperTests {

    @Autowired
    private UserMapper userMapper;


    /*
    * 姓名包含0 年龄大于20 且邮箱的不为空的用户
    * select * from t_user where name like '%o%' and age >20 and email is not null
    * */
    @Test
    void queryUser(){
        QueryWrapper<User> query=new QueryWrapper<>();
        query.like("name", "a")
                .gt("age",22)
                .isNotNull("email");
        List<User> users = userMapper.selectList(query);
        users.forEach(System.out::println);
    }


    /*
    * 首先根据年龄升序，年龄相同的根据id降序
    * */
    @Test
    void queryAllUserByOrder(){
        QueryWrapper<User> wrapper=new QueryWrapper<>();
        wrapper.orderByAsc("age")
                .orderByDesc("id");
        List<User> users = userMapper.selectList(wrapper);
        users.forEach(System.out::println);
    }


    @Test
    void deleteUser(){
        QueryWrapper<User> wrapper=new QueryWrapper<>();
        wrapper.lt("age",18);
        int i = userMapper.delete(wrapper);
        System.out.println(i);
    }

    /* 查询出姓名中包含0，且年龄大于23或者邮箱地址为空的记录
    * select *from t_user where(name like '%o%' and age >23 or email is null)
    */
    @Test
    void queryAllUser(){
        QueryWrapper<User> wrapper=new QueryWrapper<>();
        /*wrapper.like("name","0")
                .gt("age",23)
                .or().isNull("email");*/
        wrapper.and((item) -> {
            item.like("name","0")
                    .gt("age",23);
        }).or((item) -> {
            item.isNull("email");
        });
        List<User> users = userMapper.selectList(wrapper);
        users.forEach(System.out::println);
    }



    /* 查询出姓名中包含0，且年龄大于23或者邮箱地址为空的记录
     * select *from t_user where(name like '%o%' and age >23 or email is null)
     */
    @Test
    void queryAllUserA(){
        QueryWrapper<User> wrapper=new QueryWrapper<>();
        /*wrapper.like("name","a")
                .gt("age",23)
                .or().isNull("email");*/
        wrapper.and((item) -> {
            item.like("name","a")
                    .gt("age",23);
        }).or((item) -> {
            item.isNotNull("email");
        }).select("id","name","age","email");
        List<User> users = userMapper.selectList(wrapper);
        users.forEach(System.out::println);
/*        List<Map<String, Object>> maps = userMapper.selectMaps(wrapper);
        maps.forEach(System.out::println);*/
    }

    /* 查询出姓名中包含0，且年龄大于23或者邮箱地址为空的记录
     * select *from t_user where(name like '%o%' and age >23 or email is null)
     */
    @Test
    void queryAllUserMap(){
        QueryWrapper<User> wrapper=new QueryWrapper<>();
        /*wrapper.like("name","a")
                .gt("age",23)
                .or().isNull("email");*/
        wrapper.and((item) -> {
            item.like("name","a")
                    .gt("age",23);
        }).or((item) -> {
            item.isNotNull("email");
        }).select("id","name","age","email");
        List<Map<String, Object>> maps = userMapper.selectMaps(wrapper);
        maps.forEach(System.out::println);
    }

    /* 查询出姓名中包含0，且年龄大于23或者邮箱地址为空的记录
     * select  * from user where id in (select id from user where id <6)
     */
    @Test
    void sonSQL(){
        QueryWrapper<User> wrapper=new QueryWrapper<>();
        wrapper.inSql("id","select id from user where id < 6");
        List<Map<String, Object>> maps = userMapper.selectMaps(wrapper);
        maps.forEach(System.out::println);
    }

    /**
     * 更新用户Tom的age和邮箱信息
     * UPDATE t_user SET age=?,email=? WHERE (name = ?)
     */
    @Test
    void updateUser() {
        UpdateWrapper<User> wrapper = new UpdateWrapper<>();
        wrapper.set("age",25)
                .set("email","bobo@qq.com")
                .eq("name","Tom");
        int update = userMapper.update(null, wrapper);
        System.out.println("update = " + update);
    }

    /*
    * 实际开发中，用户的查询条件都是动态的，我们需要根据不同的输入条件来动态的生成对应的SQL语句
    * */
    @Test
    void queryUserByCondition() {
        String name = "panpan";
        Integer age = null;
        String email = null;
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        if (!StringUtils.isEmpty(name)) {
            wrapper.eq("name", name);
        }
        if (age != null && age > 0) {
            wrapper.eq("age", age);
        }
        if (!StringUtils.isEmpty(email)) {
            wrapper.eq("email", email);
        }
        List<User> users = userMapper.selectList(wrapper);
        users.forEach(System.out::println);
    }

    @Test
    void queryUserByConditionA(){
        String name = "panpan";
        Integer age = null;
        String email = null;
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(name),"name",name)
                .eq(age!=null && age>0,"age",age)
                .eq(StringUtils.isNotBlank(email),"email",email);
        List<User> users = userMapper.selectList(wrapper);
        users.forEach(System.out::println);
    }

    /*
    * 分页插件的测试阶段
    * */

    @Test
    void queryPage() {
        Page<User> page = new Page<>(1,5);
        Page<User> userPage = userMapper.selectPage(page, null);
        System.out.println("userPage.getCurrent() = " + userPage.getCurrent());
        System.out.println("userPage.getSize() = " + userPage.getSize());
        System.out.println("userPage.getTotal() = " + userPage.getTotal());
        System.out.println("userPage.getPages() = " + userPage.getPages());
        System.out.println("userPage.hasPrevious() = " + userPage.hasPrevious());
        System.out.println("userPage.hasNext() = " + userPage.hasNext());
    }
}
