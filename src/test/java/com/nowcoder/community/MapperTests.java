package com.nowcoder.community;

import com.nowcoder.community.dao.DiscussPostMapper;
import com.nowcoder.community.dao.UserMapper;
import com.nowcoder.community.entity.DiscussPost;
import com.nowcoder.community.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

/**
 * @author zhj
 * @create 2022-06-06 21:27:06
 */
@SpringBootTest
public class MapperTests {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private DiscussPostMapper discussPostMapper;

    @Test
    public void testelectUserById(){
        User user = userMapper.selectUserById(101);
        System.out.println(user);
        user = userMapper.selectUserByName("liubei");
        System.out.println(user);
        user=userMapper.selectUserByEmail("nowcoder101@sina.com");
        System.out.println(user);
    }

    @Test
    public  void testInsertUser(){

        User user = new User("test", "test", "abc", "test@qq.com", "http:www.nowcoder.com/101.png", new Date());
        int i = userMapper.insertUser(user);
        System.out.println(i);
        System.out.println(user.getId());
    }
    @Test
    public void testUpdate(){
        int i = userMapper.updateStatus(150, 1);
        System.out.println(i);
        int i1 = userMapper.updateHeader(150, "http:www.nowcoder.com/1022.png");
        System.out.println(i1);
    }
    @Test
    public void testSelectPosts(){
        List<DiscussPost> discussPosts = discussPostMapper.selectDiscussPosts(0, 0, 149);
        for (DiscussPost discussPost:discussPosts){
            System.out.println(discussPost);
        }
        int i = discussPostMapper.selectDiscussRows(0);
        System.out.println(i);
    }
}
