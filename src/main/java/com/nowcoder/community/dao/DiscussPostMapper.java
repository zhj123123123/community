package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author zhj
 * @create 2022-06-06 22:24:08
 */
@Mapper
public interface DiscussPostMapper {
            //接口中的所有方法都是public

    List<DiscussPost> selectDiscussPosts(int userId,int offset,int limit);

//@Param 注解给参数取别名  查询所有帖子数目
    int selectDiscussRows(@Param("userId") int userId);

}
