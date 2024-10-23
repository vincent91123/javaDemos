package com.panpan.mybatisplus;

import com.baomidou.mybatisplus.core.toolkit.Assert;
import com.panpan.mybatisplus.entity.User;
import com.panpan.mybatisplus.mapper.UserMapper;
import com.panpan.mybatisplus.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

@SpringBootTest
class MybatisPlusApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        Assert.isTrue(5 == userList.size(), "");
        userList.forEach(System.out::println);
    }

    @Test
    void queryAllUser(){
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }

    @Test
    void addUser(){
        User user=new User();
        user.setId(1114431123L);
        user.setName("panpan");
        user.setAge(18);
        int i = userMapper.insert(user);
        System.out.println(i);
    }
    
    @Test
    void updateUser(){
        User user=new User();
        user.setId(11144311231L);
        user.setName("panpanupdate");
        user.setAge(20);
        int i = userMapper.updateById(user);
        System.out.println(i);
    }
    

    @Test
    void deleteUser(){
        int i=userMapper.deleteById(1114431123L);
        System.out.println("i="+i);
    }

    @Test
    void deleteByIdMap(){
        Map<String ,Object> map=new HashMap<>();
        map.put("id",6);
        map.put("name","tom");
        int i = userMapper.deleteByMap(map);
        System.out.println(i);
    }

    @Test
    void deleteBatchById(){
        int i=userMapper.deleteBatchIds(Arrays.asList(1l,2l,3l,4l,5l));
        System.out.println("i="+i);
    }

    @Test
    void selectBatchById(){
        List<User> users=userMapper.selectBatchIds(Arrays.asList(1l,2l,3l,4l,5l));
        users.forEach(System.out::println);
    }

    @Test
    void selectById(){
        User user=userMapper.selectById(1l);
        System.out.println(user);
    }

    @Test
    void selectByMap(){
        Map<String,Object> map=new HashMap<>();
        map.put("id",3);
        map.put("name","Tom");
        List<User> users=userMapper.selectByMap(map);
        users.forEach(System.out::println);
    }

    @Test
    void selectBatchByid(){
        List<User> users=userMapper.selectBatchIds(Arrays.asList(1l,2l,3l,4l,5l));
        users.forEach(System.out::println);
    }

    @Autowired
    private UserService userService;

    @Test
    void selectById1(){
        User user =userService.getById(1l);
        System.out.println(user);
    }

    @Test
    void selectList(){
        List<User> list=userService.list();
        list.forEach(System.out::println);
    }


    @Test
    void save(){
        User user=new User();
        user.setName("panpanSave");
        user.setEmail("panpan@stella.com.hk");
        user.setAge(22);
        boolean flag = userService.save(user);
        System.out.println("flag="+flag);
    }

    @Test
    void SaveBatch(){
        List<User> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user=new User();
            user.setName("panpanSaveBatch"+i);
            user.setEmail("panpan@stella.com.hk"+i+"A");
            user.setAge(22+i);
            list.add(user);
        }
        boolean flag = userService.saveBatch(list,30);
        System.out.println("flag="+flag);
    }

    @Test
    void remove(){
        userService.removeById(1l);
    }
}
