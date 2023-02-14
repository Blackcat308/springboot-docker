package org.sbd.t.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.AllArgsConstructor;
import org.sbd.t.entity.User;
import org.sbd.t.mapper.UserMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description: @see
 * @author: LaoCat
 * @date: 2023/2/14
 */
@Service
@AllArgsConstructor
public class UserService extends ServiceImpl<UserMapper, User> {

    private final UserMapper userMapper;

    /**
     * @description: 获取用户
     * @author: LaoCat
     * @date: 2023/2/14
     * @returnType: org.sbd.t.entity.User
     */
    public List<User> user() {
        return userMapper.selectList(null);
    }
}
