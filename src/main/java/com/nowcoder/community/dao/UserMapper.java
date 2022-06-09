package com.nowcoder.community.dao;

import com.nowcoder.community.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zhj
 * @create 2022-06-03 0:02:32
 */
@Mapper
public interface UserMapper {
    User selectUserById(int id);
    User selectUserByEmail(String email);
    User selectUserByName(String username);
    int  insertUser(User user);

    int updateStatus(int id,int status);
    int  updateHeader(int id,String headerUrl);
    int updatePasswrod(int id,String password);

}
