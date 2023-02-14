package org.sbd.t.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.sbd.t.entity.User;

/**
 * @description: @see
 * @author: LaoCat
 * @date: 2023/2/14
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
