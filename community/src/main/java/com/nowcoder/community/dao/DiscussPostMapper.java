package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {
    List<DiscussPost> selectDiscussPost(int userId, int offset, int limit);

    // @Param注解用于取别名
    // 如果只有一个参数，并且在里<if>使用，必须取别名
    int selectDiscussPostRows(@Param("userId") int userId);

}
